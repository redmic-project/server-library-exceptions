package es.redmic.exception.elasticsearch;

import es.redmic.exception.common.BadRequestException;
import es.redmic.exception.common.ExceptionType;

public class ESBBoxQueryException extends BadRequestException {

	private static final long serialVersionUID = 3658782399097632577L;

	public ESBBoxQueryException(Exception e) {
		super(ExceptionType.ES_BBOX_QUERY_ERROR);
		setSource(e);
	}
}
