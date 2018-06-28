package es.redmic.test.unit.exception.user;

import java.io.IOException;

import org.junit.Test;

import es.redmic.exception.common.ExceptionType;
import es.redmic.exception.user.ResetPasswordTimeOutException;
import es.redmic.test.unit.exception.common.BaseExceptionTest;

public class ResetPasswordTimeOutExceptionTest extends BaseExceptionTest {

	@Test
	public void checkPattern_IsEqualToMessage_WhenNoLocaleSet() throws IOException {

		checkMessage(new ResetPasswordTimeOutException(), ExceptionType.RESET_PASSWORD_TIMEOUT.toString(), null);
	}
}
