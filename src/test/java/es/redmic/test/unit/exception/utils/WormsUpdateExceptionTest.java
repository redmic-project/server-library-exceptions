package es.redmic.test.unit.exception.utils;

import java.io.IOException;
import java.util.Arrays;

import org.junit.Test;

import es.redmic.exception.common.ExceptionType;
import es.redmic.exception.utils.WormsUpdateException;
import es.redmic.test.unit.exception.common.BaseExceptionTest;

public class WormsUpdateExceptionTest extends BaseExceptionTest {

	@Test
	public void checkPattern_IsEqualToMessage_WhenNoLocaleSet() throws IOException {

		String ahpia = "12123";

		checkMessage(new WormsUpdateException(ahpia), ExceptionType.WORMS_UPDATE_ERROR.toString(),
				Arrays.asList(ahpia));
	}
}
