package es.redmic.test.unit.exception.mediastorage;

import java.io.IOException;
import java.util.Arrays;

import org.junit.Test;

import es.redmic.exception.common.ExceptionType;
import es.redmic.exception.mediastorage.MSFileNotFoundException;
import es.redmic.test.unit.exception.common.BaseExceptionTest;

public class MSFileNotFoundExceptionTest extends BaseExceptionTest {

	@Test
	public void checkPattern_IsEqualToMessage_WhenNoLocaleSet() throws IOException {

		// @formatter:off
		String filename = "taxons.png",
			path = "animal";
		// @formatter:on

		checkMessage(new MSFileNotFoundException(filename, path), ExceptionType.FILE_NOT_FOUND.toString(),
				Arrays.asList(filename, path));
	}
}
