package es.redmic.exception.tasks.ingest;

import es.redmic.exception.common.ExceptionType;

public class IngestFileException extends IngestBaseException {

	private static final long serialVersionUID = 3658782399097632577L;

	public IngestFileException(String taskId) {
		this(taskId, null);
	}

	public IngestFileException(String taskId, Exception e) {
		super(taskId, TaskExceptionIds.INGEST_FILE_EXCEPTION, ExceptionType.INGEST_FILE_EXCEPTION, e);
	}
}
