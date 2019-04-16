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

public class InternalException extends BaseException {

	private static final long serialVersionUID = 3658782399097632577L;

	public InternalException(ExceptionTypeItfc code) {
		super(code);
	}

	public InternalException(ExceptionTypeItfc code, Exception e) {
		super(code, e);
	}
}
