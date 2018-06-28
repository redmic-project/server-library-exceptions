package es.redmic.exception.user;

import es.redmic.exception.common.ExceptionType;
import es.redmic.exception.common.NotFoundException;

public class TokenNotFoundException extends NotFoundException {

	private static final long serialVersionUID = 6714485190161856195L;

	public TokenNotFoundException() {

		super(ExceptionType.TOKEN_NOT_FOUND);
	}
}
