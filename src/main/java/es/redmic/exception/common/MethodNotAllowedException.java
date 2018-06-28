package es.redmic.exception.common;

public abstract class MethodNotAllowedException extends BaseException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MethodNotAllowedException(ExceptionTypeItfc code) {
		this(code, null);
	}

	public MethodNotAllowedException(ExceptionTypeItfc code, Exception e) {
		super(code, e);
	}
}