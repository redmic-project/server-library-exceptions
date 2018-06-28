package es.redmic.exception.tasks.ingest;

import es.redmic.exception.common.ExceptionType;

public class IngestMatchingException extends IngestBaseException {

	private static final long serialVersionUID = 3658782399097632577L;

	public IngestMatchingException(String taskId) {
		this(taskId, null);
	}

	public IngestMatchingException(String taskId, Exception e) {
		super(taskId, TaskExceptionIds.INGEST_MATCHING_EXCEPTION, ExceptionType.INGEST_MATCHING_EXCEPTION, e);
	}
}