package es.redmic.test.unit.exception.user;

import java.io.IOException;

import org.junit.Test;

import es.redmic.exception.common.ExceptionType;
import es.redmic.exception.user.TokenNotFoundException;
import es.redmic.test.unit.exception.common.BaseExceptionTest;

public class TokenNotFoundExceptionTest extends BaseExceptionTest {

	@Test
	public void checkPattern_IsEqualToMessage_WhenNoLocaleSet() throws IOException {

		checkMessage(new TokenNotFoundException(), ExceptionType.TOKEN_NOT_FOUND.toString(), null);
	}
}
