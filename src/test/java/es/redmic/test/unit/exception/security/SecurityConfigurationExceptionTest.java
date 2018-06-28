package es.redmic.test.unit.exception.security;

import java.io.IOException;

import org.junit.Test;

import es.redmic.exception.common.ExceptionType;
import es.redmic.exception.security.SecurityConfigurationException;
import es.redmic.test.unit.exception.common.BaseExceptionTest;

public class SecurityConfigurationExceptionTest extends BaseExceptionTest {

	@Test
	public void checkPattern_IsEqualToMessage_WhenNoLocaleSet() throws IOException {

		checkMessage(new SecurityConfigurationException(null),
				ExceptionType.SECURITY_CONFIGURATION_EXCEPTION.toString(), null);
	}
}
