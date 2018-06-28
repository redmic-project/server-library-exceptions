package es.redmic.test.unit.exception.tasks.report;

import java.io.IOException;
import java.util.Arrays;

import org.junit.Test;

import es.redmic.exception.common.ExceptionType;
import es.redmic.exception.tasks.report.GenerateReportException;
import es.redmic.test.unit.exception.common.BaseExceptionTest;

public class GenerateReportExceptionTest extends BaseExceptionTest {

	@Test
	public void checkPattern_IsEqualToMessage_WhenNoLocaleSet() throws IOException {

		// @formatter:off
		String type = "Activity",
				ids= "1,2,3,4";
		// @formatter:on

		checkMessage(new GenerateReportException(type, ids, null), ExceptionType.REPORT_ERROR.toString(),
				Arrays.asList(type, ids));
	}
}
