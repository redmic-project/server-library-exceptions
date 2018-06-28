package es.redmic.exception.tasks.ingest;

import es.redmic.exception.common.BaseException;
import es.redmic.exception.common.ExceptionType;

public abstract class IngestBaseException extends BaseException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IngestBaseException(String taskId, TaskExceptionIds typeId, ExceptionType code) {

		this(taskId, typeId, code, null);
	}

	public IngestBaseException(String taskId, TaskExceptionIds typeId, ExceptionType code, Exception e) {
		super(code, e);
		setTaskId(taskId);
		setTypeId(typeId);
	}

	private String taskId;

	private TaskExceptionIds typeId;

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public TaskExceptionIds getTypeId() {
		return typeId;
	}

	public void setTypeId(TaskExceptionIds typeId) {
		this.typeId = typeId;
	}
}
