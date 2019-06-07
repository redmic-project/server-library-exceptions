package es.redmic.exception.common;

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

public enum ExceptionType implements ExceptionTypeItfc {

	// @formatter:off
	
	// Atlas
	LAYER_NOT_FOUND(Constants.LAYER_NOT_FOUND),
	
	// Taxonomy
	
	INVALID_APHIA(Constants.INVALID_APHIA),
	
	// Utils
	EXTERNAL_RESOURCE(Constants.EXTERNAL_RESOURCE), 
	FORMAT_FILE_NOT_ALLOWED(Constants.FORMAT_FILE_NOT_ALLOWED),
	GENERATE_REPORT(Constants.GENERATE_REPORT),
	LANGUAGE_NOT_ALLOWED(Constants.LANGUAGE_NOT_ALLOWED),
	PROCCESS_ERROR(Constants.PROCCESS_ERROR),
	DECOMPRESS_ERROR(Constants.DECOMPRESS_ERROR),
	SHAPE_FILE_READER_ERROR(Constants.SHAPE_FILE_READER_ERROR),
	WORMS_UPDATE_ERROR(Constants.WORMS_UPDATE_ERROR),
	
	GENERATE_SITEMAP(Constants.GENERATE_SITEMAP),
	
	// User
	ACTIVATE_ACCOUNT_TIMEOUT(Constants.ACTIVATE_ACCOUNT_TIMEOUT),
	PASSWORD_NOT_MATCH(Constants.PASSWORD_NOT_MATCH),
	RESET_PASSWORD_TIMEOUT(Constants.RESET_PASSWORD_TIMEOUT),
	TOKEN_NOT_FOUND(Constants.TOKEN_NOT_FOUND),
	RECAPTCHA_NOT_VALID(Constants.RECAPTCHA_NOT_VALID),
	
	// Security
	NOT_ALLOWED_EXCEPTION(Constants.NOT_ALLOWED_EXCEPTION),
	SECURITY_CONFIGURATION_EXCEPTION(Constants.SECURITY_CONFIGURATION_EXCEPTION),
	
	// MediaStorage
	FILE_NOT_FOUND(Constants.FILE_NOT_FOUND),
	FILE_NOT_SUPPORT(Constants.FILE_NOT_SUPPORT),
	FILE_UPLOAD(Constants.FILE_UPLOAD),
	FILE_UPLOAD_NOT_FOUND(Constants.FILE_UPLOAD_NOT_FOUND),
	FILE_UPLOAD_NUMBER_FILES_EXCEEDED(Constants.FILE_UPLOAD_NUMBER_FILES_EXCEEDED),
	
	// ElasticSearch
	ES_PARSE_ERROR(Constants.ES_PARSE_ERROR),
	ES_SELECTION_WORK(Constants.ES_SELECTION_WORK),
	ES_UPDATE_DOCUMENT(Constants.ES_UPDATE_DOCUMENT),
	ES_INDEX_DOCUMENT(Constants.ES_INDEX_DOCUMENT),
	ES_TOO_MANY_SELECTED_ITEMS(Constants.ES_TOO_MANY_SELECTED_ITEMS),
	ES_NOT_EXISTS_INDEX(Constants.ES_NOT_EXISTS_INDEX),
	ES_NOT_EXISTS_TYPE(Constants.ES_NOT_EXISTS_TYPE),
	ES_BBOX_QUERY_ERROR(Constants.ES_BBOX_QUERY_ERROR),
	ES_HISTOGRAM_INTERVAL_QUERY_ERROR(Constants.ES_HISTOGRAM_INTERVAL_QUERY_ERROR),
	ES_TERM_QUERY_ERROR(Constants.ES_TERM_QUERY_ERROR),
	ES_QUERY_ERROR(Constants.ES_QUERY_ERROR),
	ES_INSERT_DOCUMENT(Constants.ES_INSERT_DOCUMENT),
	ES_CREATE_MAPPING_ERROR(Constants.ES_CREATE_MAPPING_ERROR),
	ES_DELETE_ITEM_WITH_CHILDREN_ERROR(Constants.ES_DELETE_ITEM_WITH_CHILDREN_ERROR),
	
	// DTOs
	DTO_NOT_VALID(Constants.DTO_NOT_VALID),
	DTO_FIELD_NOT_VALID(Constants.DTO_FIELD_NOT_VALID),
	
	SERIALIZE_DATETIME_ERROR(Constants.SERIALIZE_DATETIME_ERROR),
	DESERIALIZE_DATETIME_ERROR(Constants.DESERIALIZE_DATETIME_ERROR),
	
	//Data structure
	DATA_TYPE_NOT_VALID(Constants.DATA_TYPE_NOT_VALID),
	
	//Queries
	REQUEST_NOT_VALID(Constants.REQUEST_NOT_VALID),
	
	// Database
	DB_CONSTRAINT_VIOLATION(Constants.DB_CONSTRAINT_VIOLATION),
	DB_NOT_FOUND(Constants.DB_NOT_FOUND),
	DB_PROPERTY_ERROR(Constants.DB_PROPERTY_ERROR),
	DB_QUERY(Constants.DB_QUERY),
	
	// Data
	ITEM_ALREADY_EXIST_EXCEPTION(Constants.ITEM_ALREADY_EXIST_EXCEPTION),
	DELETE_ITEM_EXCEPTION(Constants.DELETE_ITEM_EXCEPTION),
	ITEM_NOT_FOUND(Constants.ITEM_NOT_FOUND),
	
	INTERNAL_EXCEPTION(Constants.INTERNAL_EXCEPTION),
	RESOURCE_NOT_FOUND(Constants.RESOURCE_NOT_FOUND),
	
	// Data
	DT_INCCORRECT_INTERVAL(Constants.DT_INCCORRECT_INTERVAL),
	
	// Tasks
	INGEST_PERSISTENCE_DATA_EXCEPTION(Constants.INGEST_PERSISTENCE_DATA_EXCEPTION),
	INGEST_MATCHING_EXCEPTION(Constants.INGEST_MATCHING_EXCEPTION),
	INGEST_MATCHING_SIZE_EXCEPTION(Constants.INGEST_MATCHING_SIZE_EXCEPTION),
	INGEST_MATCHING_COLUMN_EXCEPTION(Constants.INGEST_MATCHING_COLUMN_EXCEPTION),
	INGEST_MATCHING_COLUMN_REQUIRED_EXCEPTION(Constants.INGEST_MATCHING_COLUMN_REQUIRED_EXCEPTION),
	INGEST_MATCHING_DATADEFINITION_CONSTRAINTS(Constants.INGEST_MATCHING_DATADEFINITION_CONSTRAINTS),
	INGEST_MATCHING_CLASSIFICATION_CONSTRAINTS(Constants.INGEST_MATCHING_CLASSIFICATION_CONSTRAINTS),
	INGEST_MATCHING_GEOMETRY(Constants.INGEST_MATCHING_GEOMETRY),
	INGEST_FILE_EXCEPTION(Constants.INGEST_FILE_EXCEPTION),
	
	ITEM_PROCESSOR_ORDER_EXCEPTION(Constants.ITEM_PROCESSOR_ORDER_EXCEPTION),
	ITEM_PROCESSOR_GEOMETRY_EXCEPTION(Constants.ITEM_PROCESSOR_GEOMETRY_EXCEPTION),
	ITEM_PROCESSOR_DATA_VALUE_EXCEPTION(Constants.ITEM_PROCESSOR_DATA_VALUE_EXCEPTION),
	
	JOB_EXECUTION_EXCEPTION(Constants.JOB_EXECUTION_EXCEPTION),
	JOB_STARTED_STEP_NOT_ALLOWED(Constants.JOB_STARTED_STEP_NOT_ALLOWED),
	JOB_WAITING_INTERVENTION_STEP_NOT_ALLOWED(Constants.JOB_WAITING_INTERVENTION_STEP_NOT_ALLOWED),
	JOB_INTERVENTION_STEP_NOT_ALLOWED(Constants.JOB_INTERVENTION_STEP_NOT_ALLOWED),
	JOB_MATCHING_INTERVENTION_STEP_NOT_ALLOWED(Constants.JOB_MATCHING_INTERVENTION_STEP_NOT_ALLOWED),
	JOB_RUNNING_STEP_NOT_ALLOWED(Constants.JOB_RUNNING_STEP_NOT_ALLOWED),
	JOB_COMPLETED_STEP_NOT_ALLOWED(Constants.JOB_COMPLETED_STEP_NOT_ALLOWED),
	
	REPORT_ERROR(Constants.REPORT_ERROR),
	
	NO_CONTENT(Constants.NO_CONTENT);
	
	// @formatter:on

	final String type;

	ExceptionType(String type) {
		this.type = type;
	}

	public static ExceptionType fromString(String text) {
		if (text != null) {
			for (ExceptionType b : ExceptionType.values()) {
				if (text.equalsIgnoreCase(b.type)) {
					return b;
				}
			}
		}
		throw new IllegalArgumentException(text + " has no corresponding value");
	}

	@Override
	public String toString() {
		return type;
	}

	private static class Constants {

		// @formatter:off
		public static final String
			// Atlas
			LAYER_NOT_FOUND = "LayerNotFound",
			
			//Taxonomy
			
			INVALID_APHIA = "InvalidAphia",
		
			// Utils
			EXTERNAL_RESOURCE = "ExternalResourceException",
			FORMAT_FILE_NOT_ALLOWED = "FormatFileNotAllowed",
			GENERATE_REPORT = "GenerateReport",
			LANGUAGE_NOT_ALLOWED = "LanguageNotAllowed",
			PROCCESS_ERROR = "ProccessError",
			DECOMPRESS_ERROR = "DecompressError",
			SHAPE_FILE_READER_ERROR = "ShapeFileReaderError",
			WORMS_UPDATE_ERROR = "WormsUpdateError",
					
			GENERATE_SITEMAP = "GenerateSitemap",
		
			// User
			ACTIVATE_ACCOUNT_TIMEOUT = "ActivateAccountTimeOut",
			PASSWORD_NOT_MATCH = "PasswordNotMatch",
			RESET_PASSWORD_TIMEOUT = "ResetPasswordTimeOut",
			TOKEN_NOT_FOUND = "TokenNotFound",
			RECAPTCHA_NOT_VALID = "RecaptchaNotValid",

			// Security
			NOT_ALLOWED_EXCEPTION = "NotAllowedException",
			SECURITY_CONFIGURATION_EXCEPTION = "SecurityConfigurationException",

			// MediaStorage
			FILE_NOT_FOUND = "FileNotFoundException",
			FILE_NOT_SUPPORT = "FileNotSupportedException",
			FILE_UPLOAD = "FileUploadException",
			FILE_UPLOAD_NOT_FOUND = "FileUploadNotFoundException",
			FILE_UPLOAD_NUMBER_FILES_EXCEEDED = "FileUploadNumberFilesExceeded",
			
			// ElasticSearch
			ES_PARSE_ERROR = "ESParseException",
			ES_SELECTION_WORK = "SelectionWorkException",
			ES_UPDATE_DOCUMENT = "ESUpdateException",
			ES_INDEX_DOCUMENT = "ESIndexException",
			ES_TOO_MANY_SELECTED_ITEMS = "ESTooManySelectedItems",
			ES_NOT_EXISTS_INDEX = "ESNotExistsIndex",
			ES_NOT_EXISTS_TYPE = "ESNotExistsType",
			ES_BBOX_QUERY_ERROR = "ESBboxQueryError",
			ES_HISTOGRAM_INTERVAL_QUERY_ERROR = "ESHistogramIntervalQueryError",
			ES_TERM_QUERY_ERROR = "ESTermQueryError",
			ES_QUERY_ERROR = "ESQueryError",
			ES_INSERT_DOCUMENT = "ESInsertError",
			ES_CREATE_MAPPING_ERROR = "ESCreateMappingError",
			ES_DELETE_ITEM_WITH_CHILDREN_ERROR = "ESDeleteItemWithChildrenError",
			
			// DTOs
			DTO_NOT_VALID = "DTONotValidException",
			DTO_FIELD_NOT_VALID = "FieldNotValidException",
			
			SERIALIZE_DATETIME_ERROR = "DateTimeSerializerException",
			DESERIALIZE_DATETIME_ERROR = "DateTimeDeserializerException",
					
			//Data structure
			DATA_TYPE_NOT_VALID = "DataTypeNotValid",
			
			// Request
			REQUEST_NOT_VALID = "RequestNotValid",
			
			// Database
			DB_CONSTRAINT_VIOLATION = "DBConstraintViolation",
			DB_NOT_FOUND = "DBNotFound",
			DB_PROPERTY_ERROR = "DBPropertyValueException",
			DB_QUERY = "DBQueryException",
			
			// Data
			ITEM_ALREADY_EXIST_EXCEPTION = "ItemAlreadyExistException",
			DELETE_ITEM_EXCEPTION = "DeleteItemException",
			ITEM_NOT_FOUND = "ItemNotFound",
			
			INTERNAL_EXCEPTION = "InternalException",
			RESOURCE_NOT_FOUND = "ResourceNotFound",
			
			// Data
			DT_INCCORRECT_INTERVAL = "IncorrectInterval",
			
			// Tasks
			INGEST_PERSISTENCE_DATA_EXCEPTION = "IngestPersistenceDataException",
			INGEST_MATCHING_EXCEPTION = "IngestMatchingException",
			INGEST_MATCHING_SIZE_EXCEPTION = "IngestMatchingSizeException",
			INGEST_MATCHING_COLUMN_EXCEPTION = "IngestMatchingColumnException",
			INGEST_MATCHING_COLUMN_REQUIRED_EXCEPTION = "IngestMatchingColumnRequiredException",
			INGEST_MATCHING_DATADEFINITION_CONSTRAINTS = "IngestMatchingDataDefinitionConstraintsException",
			INGEST_MATCHING_CLASSIFICATION_CONSTRAINTS = "IngestMatchingClassificationConstraintsException",
			INGEST_MATCHING_GEOMETRY = "IngestMatchingGeometry",
			INGEST_FILE_EXCEPTION = "IngestFileException",
			
			ITEM_PROCESSOR_ORDER_EXCEPTION = "ItemProcessorOrderException",
			ITEM_PROCESSOR_DATA_VALUE_EXCEPTION = "ItemProcessorDataValueException",
			ITEM_PROCESSOR_GEOMETRY_EXCEPTION = "ItemProcessorGeometryException",
			
			JOB_EXECUTION_EXCEPTION = "JobExecutionException",
			JOB_STARTED_STEP_NOT_ALLOWED =  "JobStartedStepNotAllowedException",
			JOB_WAITING_INTERVENTION_STEP_NOT_ALLOWED =  "JobWaitingInterventionStepNotAllowedException",
			JOB_INTERVENTION_STEP_NOT_ALLOWED = "JobInterventionStepNotAllowed",
			JOB_MATCHING_INTERVENTION_STEP_NOT_ALLOWED = "JobMatchingInterventionStepNotAllowed",
			JOB_RUNNING_STEP_NOT_ALLOWED = "JobRunningStepNotAllowed",
			JOB_COMPLETED_STEP_NOT_ALLOWED = "JobCompletedStepNotAllowed",
			
			REPORT_ERROR = "ReportError",
		
			NO_CONTENT = "NoContentException";
		// @formatter:on
	}

}
