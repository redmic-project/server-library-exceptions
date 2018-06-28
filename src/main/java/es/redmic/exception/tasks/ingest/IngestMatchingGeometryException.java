package es.redmic.exception.tasks.ingest;

import java.util.Arrays;

import es.redmic.exception.common.ExceptionType;

public class IngestMatchingGeometryException extends IngestBaseException {

	private static final long serialVersionUID = 3658782399097632577L;

	public IngestMatchingGeometryException(String geometryType, String geometryTypeExpected, String taskId) {
		super(taskId, TaskExceptionIds.INGEST_MATCHING_EXCEPTION, ExceptionType.INGEST_MATCHING_GEOMETRY);
		setFieldErrors(Arrays.asList(geometryType, geometryTypeExpected));
	}
}
