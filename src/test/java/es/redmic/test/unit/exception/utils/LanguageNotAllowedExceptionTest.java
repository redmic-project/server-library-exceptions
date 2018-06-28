package es.redmic.test.unit.exception.utils;

import java.io.IOException;
import java.util.Arrays;

import org.junit.Test;

import es.redmic.exception.common.ExceptionType;
import es.redmic.exception.utils.LanguageNotAllowedException;
import es.redmic.test.unit.exception.common.BaseExceptionTest;

public class LanguageNotAllowedExceptionTest extends BaseExceptionTest {

	@Test
	public void checkPattern_IsEqualToMessage_WhenNoLocaleSet() throws IOException {

		String language = "Italiano";

		checkMessage(new LanguageNotAllowedException(language), ExceptionType.LANGUAGE_NOT_ALLOWED.toString(),
				Arrays.asList(language));
	}
}
