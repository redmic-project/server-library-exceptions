package es.redmic.exception.utils;

import es.redmic.exception.common.BadRequestException;
import es.redmic.exception.common.ExceptionType;

public class ProcessErrorException extends BadRequestException {

	private static final long serialVersionUID = 1408364328314226986L;

	public ProcessErrorException(Exception e) {
		super(ExceptionType.PROCCESS_ERROR, e);
	}
}