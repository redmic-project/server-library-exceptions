package es.redmic.exception.handler;

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

import java.util.List;
import java.util.Locale;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;

import es.redmic.exception.common.BaseException;
import es.redmic.exception.dto.ErrorDTO;

public abstract class BaseExceptionHandler {

	@Autowired
	private MessageSource messageSource;

	// @formatter:off
	
	private String id = UUID.randomUUID().toString(),
			defaultMessageProperty = "DefaultMessage";
	
	// @formatter:on

	Locale locale = LocaleContextHolder.getLocale();

	protected ErrorDTO getError(BaseException e) {

		String msg = getLocalizedMessage(e);
		printLog(e, msg);
		return new ErrorDTO(msg, id);
	}

	public String getLocalizedMessage(BaseException e) {

		String mess = getMessage(e.getCode().toString(), e.getFieldErrors(), locale);

		if (mess == null)
			mess = e.getMessage();

		return mess + " " + getMessage(defaultMessageProperty, null, locale);
	}

	private String getMessage(String code, List<String> args, Locale locale) {

		if (messageSource == null)
			return null;

		try {
			return messageSource.getMessage(code, (args != null ? args.toArray() : null), locale);
		} catch (Exception e) {
			return code;
		}
	}

	public void printLog(BaseException e, String msg) {

		String error = "\n Code: " + id;

		if (e.getSource() != null) {
			error += ".\n StrackTrace: " + e.getSource().getMessage();
			e.getSource().printStackTrace();
		}
		error += ".\n Message: " + msg;
		System.out.println(error);
	}
}
