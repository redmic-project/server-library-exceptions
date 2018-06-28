package es.redmic.exception.elasticsearch;

import java.util.Arrays;

import es.redmic.exception.common.BaseException;
import es.redmic.exception.common.ExceptionType;

public class ESNotExistsIndexException extends BaseException {

	private static final long serialVersionUID = -204107526629212762L;

	public ESNotExistsIndexException(String index) {
		super(ExceptionType.ES_NOT_EXISTS_INDEX);
		setFieldErrors(Arrays.asList(index));
	}
}
