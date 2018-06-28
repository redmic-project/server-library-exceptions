package es.redmic.exception.common;

public abstract class RequestTimeoutException extends BaseException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public RequestTimeoutException(ExceptionTypeItfc code) {
		this(code, null);
	}

	public RequestTimeoutException(ExceptionTypeItfc code, Exception e) {
		super(code, e);
	}
}