package es.redmic.exception.tasks.ingest;

import es.redmic.exception.common.ExceptionType;

public class JobStartedStepNotAllowedException extends IngestBaseException {

	private static final long serialVersionUID = 7301786834801457558L;

	public JobStartedStepNotAllowedException(String taskId) {

		super(taskId, TaskExceptionIds.JOB_STEP_NOT_ALLOWED, ExceptionType.JOB_STARTED_STEP_NOT_ALLOWED);
	}
}