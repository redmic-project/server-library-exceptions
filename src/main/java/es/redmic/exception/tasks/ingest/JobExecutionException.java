package es.redmic.exception.tasks.ingest;

import es.redmic.exception.common.ExceptionType;

public class JobExecutionException extends IngestBaseException {

	private static final long serialVersionUID = 3658782399097632577L;

	public JobExecutionException(String taskId) {
		this(taskId, null);
	}

	public JobExecutionException(String taskId, Exception e) {
		super(taskId, TaskExceptionIds.JOB_EXECUTION_EXCEPTION, ExceptionType.JOB_EXECUTION_EXCEPTION, e);
	}
}