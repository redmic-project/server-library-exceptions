package es.redmic.exception.tasks.ingest;

public enum TaskExceptionIds {

	// @formatter:off
	
	INGEST_PERSISTENCE_DATA_EXCEPTION (Constants.INGEST_PERSISTENCE_DATA_EXCEPTION),
	INGEST_MATCHING_EXCEPTION (Constants.INGEST_MATCHING_EXCEPTION),
	INGEST_FILE_EXCEPTION (Constants.INGEST_FILE_EXCEPTION),
	JOB_EXECUTION_EXCEPTION(Constants.JOB_EXECUTION_EXCEPTION),
	JOB_STEP_NOT_ALLOWED(Constants.JOB_STEP_NOT_ALLOWED);	
	
	// @formatter:on

	final String status;

	TaskExceptionIds(String status) {
		this.status = status;
	}

	public static TaskExceptionIds fromString(String text) {
		if (text != null) {
			for (TaskExceptionIds b : TaskExceptionIds.values()) {
				if (text.equalsIgnoreCase(b.status)) {
					return b;
				}
			}
		}
		throw new IllegalArgumentException(text + " has no corresponding value");
	}

	public String toString() {
		return status;
	}

	private static class Constants {
		// @formatter:off
		public static final String 
			INGEST_PERSISTENCE_DATA_EXCEPTION = "01",
			INGEST_MATCHING_EXCEPTION = "02",
			INGEST_FILE_EXCEPTION = "03",
			JOB_EXECUTION_EXCEPTION = "04",
			JOB_STEP_NOT_ALLOWED = "05";
		// @formatter:on
	}

}
