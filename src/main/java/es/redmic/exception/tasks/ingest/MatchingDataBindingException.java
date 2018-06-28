package es.redmic.exception.tasks.ingest;

import java.util.Arrays;

import es.redmic.exception.common.ExceptionType;

public class MatchingDataBindingException extends IngestBaseException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MatchingDataBindingException(String field, String value, String taskId) {

		super(taskId, TaskExceptionIds.INGEST_MATCHING_EXCEPTION, ExceptionType.DTO_FIELD_NOT_VALID);
		setFieldErrors(Arrays.asList(field, value));
	}
}