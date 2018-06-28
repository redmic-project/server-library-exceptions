package es.redmic.exception.common;

public class InternalException extends BaseException {

	private static final long serialVersionUID = 3658782399097632577L;

	public InternalException(ExceptionTypeItfc code) {
		super(code);
	}

	public InternalException(ExceptionTypeItfc code, Exception e) {
		super(code, e);
	}
}