package es.redmic.test.unit.exception.utils;

import java.io.IOException;

import org.junit.Test;

import es.redmic.exception.common.ExceptionType;
import es.redmic.exception.utils.DecompressException;
import es.redmic.test.unit.exception.common.BaseExceptionTest;

public class DecompressExceptionTest extends BaseExceptionTest {

	@Test
	public void checkPattern_IsEqualToMessage_WhenNoLocaleSet() throws IOException {

		checkMessage(new DecompressException(), ExceptionType.DECOMPRESS_ERROR.toString(), null);
	}
}
