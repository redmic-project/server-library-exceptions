package es.redmic.exception.user;

import es.redmic.exception.common.ExceptionType;
import es.redmic.exception.common.MethodNotAllowedException;

public class ActivateAccountTimeOutException extends MethodNotAllowedException {

	private static final long serialVersionUID = 6714485190161856195L;

	public ActivateAccountTimeOutException() {

		super(ExceptionType.ACTIVATE_ACCOUNT_TIMEOUT);
	}
}