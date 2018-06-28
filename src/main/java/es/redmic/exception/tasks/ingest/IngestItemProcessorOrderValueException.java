package es.redmic.exception.tasks.ingest;

import es.redmic.exception.common.ExceptionType;

public class IngestItemProcessorOrderValueException extends IngestBaseException {

	private static final long serialVersionUID = 3658782399097632577L;

	public IngestItemProcessorOrderValueException(String taskId) {
		super(taskId, TaskExceptionIds.JOB_EXECUTION_EXCEPTION, ExceptionType.ITEM_PROCESSOR_ORDER_EXCEPTION);
	}
}
