package es.redmic.exception.security;

import es.redmic.exception.common.ExceptionType;
import es.redmic.exception.common.MethodNotAllowedException;

public class NotAllowedException extends MethodNotAllowedException {

	private static final long serialVersionUID = -2383036434383694460L;

	public NotAllowedException() {
		super(ExceptionType.NOT_ALLOWED_EXCEPTION);
	}
}