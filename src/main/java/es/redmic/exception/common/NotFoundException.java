package es.redmic.exception.common;

public abstract class NotFoundException extends BaseException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NotFoundException(ExceptionTypeItfc code) {
		this(code, null);
	}

	public NotFoundException(ExceptionTypeItfc code, Exception e) {
		super(code, e);
	}
}
