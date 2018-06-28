package es.redmic.test.unit.exception.utils;

import java.io.IOException;
import java.util.Arrays;

import org.junit.Test;

import es.redmic.exception.common.ExceptionType;
import es.redmic.exception.utils.ExternalResourceException;
import es.redmic.test.unit.exception.common.BaseExceptionTest;

public class ExternalResourceExceptionTest extends BaseExceptionTest {

	@Test
	public void checkPattern_IsEqualToMessage_WhenNoLocaleSet() throws IOException {

		String resource = "http://www.marinespecies.org/rest/AphiaClassificationByAphiaID/3";

		checkMessage(new ExternalResourceException(resource), ExceptionType.EXTERNAL_RESOURCE.toString(),
				Arrays.asList(resource));
	}
}
