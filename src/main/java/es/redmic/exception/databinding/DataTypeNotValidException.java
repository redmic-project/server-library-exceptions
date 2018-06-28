package es.redmic.exception.databinding;

import es.redmic.exception.common.BadRequestException;
import es.redmic.exception.common.ExceptionType;

public class DataTypeNotValidException extends BadRequestException {

	private static final long serialVersionUID = 4972411864099973243L;

	public DataTypeNotValidException() {
		super(ExceptionType.DATA_TYPE_NOT_VALID);
	}
}
