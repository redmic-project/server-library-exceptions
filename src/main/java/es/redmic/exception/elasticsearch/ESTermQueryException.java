package es.redmic.exception.elasticsearch;

import java.util.Arrays;

import es.redmic.exception.common.BadRequestException;
import es.redmic.exception.common.ExceptionType;

public class ESTermQueryException extends BadRequestException {

	private static final long serialVersionUID = 3658782399097632577L;

	public ESTermQueryException(String term, String value) {
		super(ExceptionType.ES_TERM_QUERY_ERROR);
		setFieldErrors(Arrays.asList(term, value));
	}
}
