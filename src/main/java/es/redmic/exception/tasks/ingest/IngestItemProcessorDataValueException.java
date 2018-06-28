package es.redmic.exception.tasks.ingest;

import es.redmic.exception.common.ExceptionType;

public class IngestItemProcessorDataValueException extends IngestBaseException {

	private static final long serialVersionUID = 3658782399097632577L;

	public IngestItemProcessorDataValueException(String taskId) {
		super(taskId, TaskExceptionIds.JOB_EXECUTION_EXCEPTION, ExceptionType.ITEM_PROCESSOR_DATA_VALUE_EXCEPTION);
	}
}
