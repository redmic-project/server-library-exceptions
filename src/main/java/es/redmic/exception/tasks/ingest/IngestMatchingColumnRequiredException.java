package es.redmic.exception.tasks.ingest;

import java.util.Arrays;

import es.redmic.exception.common.ExceptionType;

public class IngestMatchingColumnRequiredException extends IngestBaseException {

	private static final long serialVersionUID = 3658782399097632577L;

	public IngestMatchingColumnRequiredException(String taskId, String field) {

		super(taskId, TaskExceptionIds.INGEST_MATCHING_EXCEPTION,
				ExceptionType.INGEST_MATCHING_COLUMN_REQUIRED_EXCEPTION);

		if (field != null)
			setFieldErrors(Arrays.asList(field));
	}
}
