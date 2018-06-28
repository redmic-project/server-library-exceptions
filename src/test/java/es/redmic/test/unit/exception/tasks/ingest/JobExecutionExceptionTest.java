package es.redmic.test.unit.exception.tasks.ingest;

import java.io.IOException;

import org.junit.Test;

import es.redmic.exception.common.ExceptionType;
import es.redmic.exception.tasks.ingest.JobExecutionException;
import es.redmic.test.unit.exception.common.BaseExceptionTest;

public class JobExecutionExceptionTest extends BaseExceptionTest {

	@Test
	public void checkPattern_IsEqualToMessage_WhenNoLocaleSet() throws IOException {

		checkMessage(new JobExecutionException(null), ExceptionType.JOB_EXECUTION_EXCEPTION.toString(), null);
	}
}
