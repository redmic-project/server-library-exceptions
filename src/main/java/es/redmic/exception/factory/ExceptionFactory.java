package es.redmic.exception.factory;

import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import es.redmic.exception.common.BaseException;
import es.redmic.exception.common.ExceptionType;
import es.redmic.exception.common.InternalException;
import es.redmic.exception.data.DeleteItemException;
import es.redmic.exception.data.ItemAlreadyExistException;
import es.redmic.exception.data.ItemNotFoundException;
import es.redmic.exception.elasticsearch.ESInsertException;

public class ExceptionFactory {

	private static Logger logger = LogManager.getLogger();

	public static BaseException getException(String exceptionType, Map<String, String> arguments) {

		if (exceptionType.equals(ExceptionType.ITEM_ALREADY_EXIST_EXCEPTION.name()))
			return new ItemAlreadyExistException();

		if (exceptionType.equals(ExceptionType.ITEM_NOT_FOUND.name()) && (arguments != null && arguments.size() == 1))
			// TODO: sacar errores del map
			return new ItemNotFoundException("a", "b");

		if (exceptionType.equals(ExceptionType.DELETE_ITEM_EXCEPTION.name())
				&& (arguments == null || arguments.size() == 0))
			return new DeleteItemException();

		if (exceptionType.equals(ExceptionType.ES_INSERT_DOCUMENT.name())
				&& (arguments != null && arguments.size() == 4))
			return new ESInsertException("a", "b");

		logger.error("No se ha encontrado una excepción válida para el tipo y argumentos recibidos");

		return new InternalException(ExceptionType.INTERNAL_EXCEPTION);
	}
}
