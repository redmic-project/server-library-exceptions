package es.redmic.exception.common;

public abstract class BadRequestException extends BaseException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BadRequestException(ExceptionTypeItfc code) {
		this(code, null);
	}

	public BadRequestException(ExceptionTypeItfc code, Exception e) {
		super(code, e);
	}
}