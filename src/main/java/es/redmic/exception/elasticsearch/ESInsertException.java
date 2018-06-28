package es.redmic.exception.elasticsearch;

import java.util.Arrays;

import es.redmic.exception.common.BadRequestException;
import es.redmic.exception.common.ExceptionType;

public class ESInsertException extends BadRequestException {

	private static final long serialVersionUID = 1L;

	public ESInsertException(String field, String value) {

		super(ExceptionType.ES_INSERT_DOCUMENT);
		setFieldErrors(Arrays.asList(field, value));
	}
}