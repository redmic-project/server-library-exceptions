package es.redmic.exception.user;

import es.redmic.exception.common.ExceptionType;
import es.redmic.exception.common.MethodNotAllowedException;

public class PasswordNotMatchException extends MethodNotAllowedException {

	private static final long serialVersionUID = 6714485190161856195L;

	public PasswordNotMatchException() {

		super(ExceptionType.PASSWORD_NOT_MATCH);
	}
}
