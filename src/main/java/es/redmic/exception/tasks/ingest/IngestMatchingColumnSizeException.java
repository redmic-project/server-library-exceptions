package es.redmic.exception.tasks.ingest;

import es.redmic.exception.common.ExceptionType;

public class IngestMatchingColumnSizeException extends IngestBaseException {

	private static final long serialVersionUID = 3658782399097632577L;

	public IngestMatchingColumnSizeException(String taskId) {
		super(taskId, TaskExceptionIds.INGEST_MATCHING_EXCEPTION, ExceptionType.INGEST_MATCHING_SIZE_EXCEPTION);
	}
}