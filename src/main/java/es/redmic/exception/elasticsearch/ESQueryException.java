package es.redmic.exception.elasticsearch;

import es.redmic.exception.common.BadRequestException;
import es.redmic.exception.common.ExceptionType;

public class ESQueryException extends BadRequestException {

	private static final long serialVersionUID = 3658782399097632577L;

	public ESQueryException() {
		super(ExceptionType.ES_QUERY_ERROR);
	}
}
