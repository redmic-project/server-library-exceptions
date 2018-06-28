package es.redmic.exception.data;

import java.util.Arrays;

import es.redmic.exception.common.ExceptionType;
import es.redmic.exception.common.NotFoundException;

public class ItemNotFoundException extends NotFoundException {

	private static final long serialVersionUID = 3658782399097632577L;

	public ItemNotFoundException(String field, String value) {

		super(ExceptionType.ITEM_NOT_FOUND);
		setFieldErrors(Arrays.asList(field, value));
	}
}
