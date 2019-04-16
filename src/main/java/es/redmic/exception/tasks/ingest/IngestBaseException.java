package es.redmic.exception.tasks.ingest;

/*-
 * #%L
 * Exceptions
 * %%
 * Copyright (C) 2019 REDMIC Project / Server
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

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
