package es.redmic.exception.user;

import es.redmic.exception.common.BadRequestException;
import es.redmic.exception.common.ExceptionType;

public class RecaptchaNotValidException extends BadRequestException {

	private static final long serialVersionUID = 6714485190161856195L;

	public RecaptchaNotValidException() {

		super(ExceptionType.RECAPTCHA_NOT_VALID);
	}
}
