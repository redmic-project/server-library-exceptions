package es.redmic.test.unit.exception.utils;

import java.io.IOException;

import org.junit.Test;

import es.redmic.exception.common.ExceptionType;
import es.redmic.exception.utils.ProcessErrorException;
import es.redmic.test.unit.exception.common.BaseExceptionTest;

public class ProcessErrorExceptionTest extends BaseExceptionTest {

	@Test
	public void checkPattern_IsEqualToMessage_WhenNoLocaleSet() throws IOException {

		checkMessage(new ProcessErrorException(null), ExceptionType.PROCCESS_ERROR.toString(), null);
	}
}
