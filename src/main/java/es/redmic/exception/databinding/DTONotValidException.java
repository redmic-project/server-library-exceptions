package es.redmic.exception.databinding;

/*-
 * #%L
 * Exceptions
 * %%
 * Copyright (C) 2019 REDMIC Project / Server
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import es.redmic.exception.common.BadRequestException;
import es.redmic.exception.common.ExceptionType;

public class DTONotValidException extends BadRequestException {

	private static final long serialVersionUID = 6714485190161856195L;

	public DTONotValidException(BindingResult bindingResult) {
		super(ExceptionType.DTO_NOT_VALID);
		buildException(bindingResult);
	}

	public <T> DTONotValidException(Set<ConstraintViolation<T>> violations) {
		super(ExceptionType.DTO_NOT_VALID);
		buildException(violations);
	}

	public void buildException(BindingResult bindingResult) {

		String msgErrors = "";

		Iterator<FieldError> itr = bindingResult.getFieldErrors().iterator();
		while (itr.hasNext()) {
			FieldError error = itr.next();
			msgErrors = concatError(msgErrors, error.getField(), error.getDefaultMessage());
		}
		if (!msgErrors.isEmpty())
			setFieldErrors(Arrays.asList(msgErrors));
	}

	public <T> void buildException(Set<ConstraintViolation<T>> violations) {

		String msgErrors = "";

		for (ConstraintViolation<?> violation : violations) {
			msgErrors = concatError(msgErrors, violation.getPropertyPath().toString(), violation.getMessage());
		}

		if (!msgErrors.isEmpty())
			setFieldErrors(Arrays.asList(msgErrors));
	}

	private String concatError(String msg, String path, String error) {
		return msg + " " + path + ": " + error + "; ";
	}
}
