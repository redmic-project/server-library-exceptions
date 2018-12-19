package es.redmic.exception.elasticsearch;

import java.util.Arrays;

import es.redmic.exception.common.ExceptionType;
import es.redmic.exception.common.InternalException;

public class ESCreateMappingException extends InternalException {

	private static final long serialVersionUID = -204107526629212762L;

	public ESCreateMappingException(String index) {
		super(ExceptionType.ES_CREATE_MAPPING_ERROR);
		setFieldErrors(Arrays.asList(index));
	}
}
