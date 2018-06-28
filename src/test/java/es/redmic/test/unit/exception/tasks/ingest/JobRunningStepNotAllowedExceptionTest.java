package es.redmic.test.unit.exception.tasks.ingest;

import java.io.IOException;

import org.junit.Test;

import es.redmic.exception.common.ExceptionType;
import es.redmic.exception.tasks.ingest.JobRunningStepNotAllowedException;
import es.redmic.test.unit.exception.common.BaseExceptionTest;

public class JobRunningStepNotAllowedExceptionTest extends BaseExceptionTest {

	@Test
	public void checkPattern_IsEqualToMessage_WhenNoLocaleSet() throws IOException {

		checkMessage(new JobRunningStepNotAllowedException(null), ExceptionType.JOB_RUNNING_STEP_NOT_ALLOWED.toString(),
				null);
	}
}
