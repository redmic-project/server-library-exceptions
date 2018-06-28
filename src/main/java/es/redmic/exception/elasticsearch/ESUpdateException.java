package es.redmic.exception.elasticsearch;

import es.redmic.exception.common.BadRequestException;
import es.redmic.exception.common.ExceptionType;

public class ESUpdateException extends BadRequestException {

	private static final long serialVersionUID = 1L;

	public ESUpdateException(Exception source) {

		super(ExceptionType.ES_UPDATE_DOCUMENT, source);
	}

	public ESUpdateException(String source) {

		super(ExceptionType.ES_UPDATE_DOCUMENT, new Exception(source));
	}
}