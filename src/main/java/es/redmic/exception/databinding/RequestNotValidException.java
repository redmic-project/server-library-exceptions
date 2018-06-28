package es.redmic.exception.databinding;

import java.util.Arrays;

import es.redmic.exception.common.BadRequestException;
import es.redmic.exception.common.ExceptionType;

public class RequestNotValidException extends BadRequestException {

	private static final long serialVersionUID = 4972411864099973243L;

	public RequestNotValidException(String field, String value) {

		super(ExceptionType.REQUEST_NOT_VALID);
		setFieldErrors(Arrays.asList(field, value));
	}
}
