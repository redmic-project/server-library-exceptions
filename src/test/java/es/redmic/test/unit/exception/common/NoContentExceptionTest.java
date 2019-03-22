package es.redmic.test.unit.exception.common;

import java.io.IOException;

import org.junit.Test;

import es.redmic.exception.common.ExceptionType;
import es.redmic.exception.common.NoContentException;

public class NoContentExceptionTest extends BaseExceptionTest {

	@Test
	public void checkPattern_IsEqualToMessage_WhenNoLocaleSet() throws IOException {

		checkMessage(new NoContentException(), ExceptionType.NO_CONTENT.toString(), null);
	}
}
