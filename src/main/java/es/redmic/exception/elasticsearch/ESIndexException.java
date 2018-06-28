package es.redmic.exception.elasticsearch;

import es.redmic.exception.common.ExceptionType;
import es.redmic.exception.common.NotFoundException;

public class ESIndexException extends NotFoundException {

	private static final long serialVersionUID = 3658782399097632577L;

	public ESIndexException() {

		super(ExceptionType.ES_INDEX_DOCUMENT);
	}
}
