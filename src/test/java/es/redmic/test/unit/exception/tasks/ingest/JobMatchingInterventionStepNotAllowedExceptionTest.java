package es.redmic.test.unit.exception.tasks.ingest;

import java.io.IOException;

import org.junit.Test;

import es.redmic.exception.common.ExceptionType;
import es.redmic.exception.tasks.ingest.JobMatchingInterventionStepNotAllowedException;
import es.redmic.test.unit.exception.common.BaseExceptionTest;

public class JobMatchingInterventionStepNotAllowedExceptionTest extends BaseExceptionTest {

	@Test
	public void checkPattern_IsEqualToMessage_WhenNoLocaleSet() throws IOException {

		checkMessage(new JobMatchingInterventionStepNotAllowedException(null),
				ExceptionType.JOB_MATCHING_INTERVENTION_STEP_NOT_ALLOWED.toString(), null);
	}
}
