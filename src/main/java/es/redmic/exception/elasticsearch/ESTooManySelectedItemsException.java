package es.redmic.exception.elasticsearch;

import es.redmic.exception.common.BadRequestException;
import es.redmic.exception.common.ExceptionType;

public class ESTooManySelectedItemsException extends BadRequestException {

	private static final long serialVersionUID = 1L;

	public ESTooManySelectedItemsException() {

		super(ExceptionType.ES_TOO_MANY_SELECTED_ITEMS);
	}
}