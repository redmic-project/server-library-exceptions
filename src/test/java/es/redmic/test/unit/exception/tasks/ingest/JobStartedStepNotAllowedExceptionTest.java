package es.redmic.test.unit.exception.tasks.ingest;

import java.io.IOException;

import org.junit.Test;

import es.redmic.exception.common.ExceptionType;
import es.redmic.exception.tasks.ingest.JobStartedStepNotAllowedException;
import es.redmic.test.unit.exception.common.BaseExceptionTest;

public class JobStartedStepNotAllowedExceptionTest extends BaseExceptionTest {

	@Test
	public void checkPattern_IsEqualToMessage_WhenNoLocaleSet() throws IOException {

		checkMessage(new JobStartedStepNotAllowedException(null), ExceptionType.JOB_STARTED_STEP_NOT_ALLOWED.toString(),
				null);
	}
}
