package es.redmic.exception.common;

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

import java.text.MessageFormat;
import java.util.List;

public abstract class BaseException extends RuntimeException implements IBaseException {

	private static final long serialVersionUID = -5665166285718434766L;

	protected static final String resourcePath = "classpath*:i18n/messages_es_ES.properties";

	private ExceptionTypeItfc code;
	private Exception source;
	private List<String> fieldErrors;
	private String message;
	private String pattern;

	public BaseException(ExceptionTypeItfc code) {
		this(code, null);
	}

	public BaseException(ExceptionTypeItfc code, Exception e) {
		setCode(code);
		setSource(e);

		pattern = PatternUtils.getPattern(code.toString(), resourcePath);
	}

	public ExceptionTypeItfc getCode() {
		return code;
	}

	public void setCode(ExceptionTypeItfc code) {
		this.code = code;
	}

	public Exception getSource() {
		return source;
	}

	public void setSource(Exception e) {
		this.source = e;
	}

	public List<String> getFieldErrors() {
		return fieldErrors;
	}

	public void setFieldErrors(List<String> fieldErrors) {
		this.fieldErrors = fieldErrors;
	}

	@Override
	public String getMessage() {

		if (message == null && fieldErrors != null && fieldErrors.size() > 0) {
			Object[] fields = getFieldErrors().toArray();
			MessageFormat format = new MessageFormat(pattern);
			return format.format(fields);
		}
		if (message == null)
			return pattern;

		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
