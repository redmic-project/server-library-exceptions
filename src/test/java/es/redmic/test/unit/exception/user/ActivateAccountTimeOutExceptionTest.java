package es.redmic.test.unit.exception.user;

import java.io.IOException;

import org.junit.Test;

import es.redmic.exception.common.ExceptionType;
import es.redmic.exception.user.ActivateAccountTimeOutException;
import es.redmic.test.unit.exception.common.BaseExceptionTest;

public class ActivateAccountTimeOutExceptionTest extends BaseExceptionTest {

	@Test
	public void checkPattern_IsEqualToMessage_WhenNoLocaleSet() throws IOException {

		checkMessage(new ActivateAccountTimeOutException(), ExceptionType.ACTIVATE_ACCOUNT_TIMEOUT.toString(), null);
	}
}
