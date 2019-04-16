package es.redmic.exception.database;

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
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;

import es.redmic.exception.common.ConflictException;
import es.redmic.exception.common.ExceptionType;

public class DBPropertyValueException extends ConflictException {

	private static final long serialVersionUID = 6714485190161856195L;

	public DBPropertyValueException(ConstraintViolationException source) {

		super(ExceptionType.DB_PROPERTY_ERROR, source);
		buildException(source);
	}

	public void buildException(ConstraintViolationException source) {

		ConstraintViolationException jdbcEx = (ConstraintViolationException) source;
		Set<ConstraintViolation<?>> constraints = jdbcEx.getConstraintViolations();
		String msn = null;
		String field = null;
		for (ConstraintViolation<?> i : constraints) {
			msn = i.getMessage();
			field = i.getPropertyPath().toString();
		}

		setFieldErrors(Arrays.asList(field, msn));
	}
}
