package es.redmic.exception.common;

public abstract class ConflictException extends BaseException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ConflictException(ExceptionTypeItfc code) {
		this(code, null);
	}

	public ConflictException(ExceptionTypeItfc code, Exception e) {
		super(code, e);
	}
}