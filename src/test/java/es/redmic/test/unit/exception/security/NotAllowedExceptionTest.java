package es.redmic.test.unit.exception.security;

import java.io.IOException;

import org.junit.Test;

import es.redmic.exception.common.ExceptionType;
import es.redmic.exception.security.NotAllowedException;
import es.redmic.test.unit.exception.common.BaseExceptionTest;

public class NotAllowedExceptionTest extends BaseExceptionTest {

	@Test
	public void checkPattern_IsEqualToMessage_WhenNoLocaleSet() throws IOException {

		checkMessage(new NotAllowedException(), ExceptionType.NOT_ALLOWED_EXCEPTION.toString(), null);
	}
}
