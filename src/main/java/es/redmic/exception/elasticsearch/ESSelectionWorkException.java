package es.redmic.exception.elasticsearch;

import es.redmic.exception.common.BadRequestException;
import es.redmic.exception.common.ExceptionType;

public class ESSelectionWorkException extends BadRequestException {

	private static final long serialVersionUID = 1L;

	public ESSelectionWorkException() {
		this(null);
	}

	public ESSelectionWorkException(Exception source) {
		super(ExceptionType.ES_SELECTION_WORK, source);
	}
}