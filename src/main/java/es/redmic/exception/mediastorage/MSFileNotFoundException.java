package es.redmic.exception.mediastorage;

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

import java.util.Arrays;

import es.redmic.exception.common.BaseException;
import es.redmic.exception.common.ExceptionType;

public class MSFileNotFoundException extends BaseException {

	private static final long serialVersionUID = 3658782399097632577L;

	public MSFileNotFoundException(String fileName) {

		this(fileName, null);
	}

	public MSFileNotFoundException(String filename, String path) {

		this(filename, path, null);
	}

	public MSFileNotFoundException(String filename, String path, Exception e) {

		super(ExceptionType.FILE_NOT_FOUND, e);
		setFieldErrors(Arrays.asList(filename, path));
	}
}
