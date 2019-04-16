package es.redmic.exception.utils;

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

import es.redmic.exception.common.BadRequestException;
import es.redmic.exception.common.ExceptionType;

public class ProcessErrorException extends BadRequestException {

	private static final long serialVersionUID = 1408364328314226986L;

	public ProcessErrorException(Exception e) {
		super(ExceptionType.PROCCESS_ERROR, e);
	}
}
