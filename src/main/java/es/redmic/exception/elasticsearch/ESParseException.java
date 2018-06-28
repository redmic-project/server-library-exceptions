package es.redmic.exception.elasticsearch;

import es.redmic.exception.common.BadRequestException;
import es.redmic.exception.common.ExceptionType;

public class ESParseException extends BadRequestException {

	private static final long serialVersionUID = 3658782399097632577L;

	public ESParseException(Exception e) {
		super(ExceptionType.ES_PARSE_ERROR);
		setSource(e);
	}
}
