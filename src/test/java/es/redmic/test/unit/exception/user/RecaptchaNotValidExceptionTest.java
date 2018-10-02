package es.redmic.test.unit.exception.user;

import java.io.IOException;

import org.junit.Test;

import es.redmic.exception.common.ExceptionType;
import es.redmic.exception.user.RecaptchaNotValidException;
import es.redmic.test.unit.exception.common.BaseExceptionTest;

public class RecaptchaNotValidExceptionTest extends BaseExceptionTest {

	@Test
	public void checkPattern_IsEqualToMessage_WhenNoLocaleSet() throws IOException {

		checkMessage(new RecaptchaNotValidException(), ExceptionType.RECAPTCHA_NOT_VALID.toString(), null);
	}
}
