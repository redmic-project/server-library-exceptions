package es.redmic.exception.common;

public abstract class UnsupportedMediaTypeException extends BaseException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UnsupportedMediaTypeException(ExceptionTypeItfc code) {
		this(code, null);
	}

	public UnsupportedMediaTypeException(ExceptionTypeItfc code, Exception e) {
		super(code, e);
	}
}