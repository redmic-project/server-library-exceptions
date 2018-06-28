package es.redmic.exception.data;

import es.redmic.exception.common.ConflictException;
import es.redmic.exception.common.ExceptionType;

public class ItemAlreadyExistException extends ConflictException {

	private static final long serialVersionUID = 6714485190161856195L;

	public ItemAlreadyExistException() {

		super(ExceptionType.ITEM_ALREADY_EXIST_EXCEPTION);
	}
}
