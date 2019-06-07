package es.redmic.exception.factory;

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

import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import es.redmic.exception.common.BaseException;
import es.redmic.exception.common.ExceptionType;
import es.redmic.exception.common.InternalException;
import es.redmic.exception.data.DeleteItemException;
import es.redmic.exception.data.ItemAlreadyExistException;
import es.redmic.exception.data.ItemNotFoundException;
import es.redmic.exception.elasticsearch.ESDeleteItemWithChildrenException;
import es.redmic.exception.elasticsearch.ESInsertException;
import es.redmic.exception.elasticsearch.ESUpdateException;

public class ExceptionFactory {

	private static Logger logger = LogManager.getLogger();

	public static BaseException getException(String exceptionType, Map<String, String> arguments) {

		if (exceptionType.equals(ExceptionType.ITEM_ALREADY_EXIST_EXCEPTION.name()))
			return new ItemAlreadyExistException();

		if (exceptionType.equals(ExceptionType.ITEM_NOT_FOUND.name()) && (arguments != null && arguments.size() == 1))
			return new ItemNotFoundException(getKeysFromMap(arguments), getValuesFromMap(arguments));

		if (exceptionType.equals(ExceptionType.DELETE_ITEM_EXCEPTION.name())
				&& (arguments == null || arguments.size() == 0))
			return new DeleteItemException();

		if (exceptionType.equals(ExceptionType.ES_INSERT_DOCUMENT.name())
				&& (arguments != null && arguments.size() > 0))
			return new ESInsertException(getKeysFromMap(arguments), getValuesFromMap(arguments));

		if (exceptionType.equals(ExceptionType.ES_UPDATE_DOCUMENT.name())
				&& (arguments != null && arguments.size() > 0))
			return new ESUpdateException(getKeysFromMap(arguments));

		if (exceptionType.equals(ExceptionType.ES_DELETE_ITEM_WITH_CHILDREN_ERROR.name())
				&& (arguments != null && arguments.size() > 0))
			return new ESDeleteItemWithChildrenException(getKeysFromMap(arguments), getValuesFromMap(arguments));

		if (exceptionType.equals(ExceptionType.INTERNAL_EXCEPTION.name()) && (arguments == null))
			return new InternalException(ExceptionType.INTERNAL_EXCEPTION);

		logger.error("No se ha encontrado una excepción válida para el tipo y argumentos recibidos");

		return new InternalException(ExceptionType.INTERNAL_EXCEPTION);
	}

	// TODO: Construir argumentos del tipo [campo: valor (restricción que incumple)]
	private static String getKeysFromMap(Map<String, String> arguments) {

		return String.join(",", arguments.keySet());
	}

	private static String getValuesFromMap(Map<String, String> arguments) {

		return String.join(",", arguments.values());
	}
}
