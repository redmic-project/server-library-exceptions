package es.redmic.exception.tasks.report;

import java.util.Arrays;

import es.redmic.exception.common.ExceptionType;
import es.redmic.exception.tasks.ingest.IngestBaseException;
import es.redmic.exception.tasks.ingest.TaskExceptionIds;

public class GenerateReportException extends IngestBaseException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GenerateReportException(String field, String value, String taskId) {

		super(taskId, TaskExceptionIds.JOB_EXECUTION_EXCEPTION, ExceptionType.REPORT_ERROR);
		setFieldErrors(Arrays.asList(field, value));
	}
}