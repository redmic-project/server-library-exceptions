package es.redmic.exception.tasks.ingest;

import es.redmic.exception.common.ExceptionType;

public class IngestPersistenceDataException extends IngestBaseException {

	private static final long serialVersionUID = 3658782399097632577L;

	public IngestPersistenceDataException(String taskId) {
		this(taskId, null);
	}

	public IngestPersistenceDataException(String taskId, Exception e) {
		super(taskId, TaskExceptionIds.INGEST_PERSISTENCE_DATA_EXCEPTION,
				ExceptionType.INGEST_PERSISTENCE_DATA_EXCEPTION, e);
	}
}