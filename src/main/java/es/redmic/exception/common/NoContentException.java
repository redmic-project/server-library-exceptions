package es.redmic.exception.common;

public class NoContentException extends BaseException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NoContentException() {
		super(ExceptionType.NO_CONTENT);
	}
}