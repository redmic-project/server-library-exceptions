package es.redmic.test.unit.exception.settings;

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

import java.io.IOException;

import org.junit.Test;

import es.redmic.exception.common.ExceptionType;
import es.redmic.exception.settings.DeleteSettingsNotAllowedException;
import es.redmic.test.unit.exception.common.BaseExceptionTest;

public class DeleteSettingsNotAllowedExceptionTest extends BaseExceptionTest {

	@Test
	public void checkPattern_IsEqualToMessage_WhenNoLocaleSet() throws IOException {

		checkMessage(new DeleteSettingsNotAllowedException(), ExceptionType.DELETE_SETTINGS_NOT_ALLOWED.toString(),
				null);
	}
}
