package es.redmic.exception.elasticsearch;

import java.util.Arrays;

import es.redmic.exception.common.BaseException;
import es.redmic.exception.common.ExceptionType;

public class ESNotExistsTypeException extends BaseException {

	private static final long serialVersionUID = -204107526629212762L;

	public ESNotExistsTypeException(String index, String type) {
		super(ExceptionType.ES_NOT_EXISTS_TYPE);
		setFieldErrors(Arrays.asList(index, type));
	}
}
