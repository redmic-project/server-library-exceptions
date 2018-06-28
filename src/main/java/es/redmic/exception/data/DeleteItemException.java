package es.redmic.exception.data;

import es.redmic.exception.common.ExceptionType;
import es.redmic.exception.common.NotFoundException;

public class DeleteItemException extends NotFoundException {

	private static final long serialVersionUID = 6714485190161856195L;

	public DeleteItemException() {

		super(ExceptionType.DELETE_ITEM_EXCEPTION);
	}
}
