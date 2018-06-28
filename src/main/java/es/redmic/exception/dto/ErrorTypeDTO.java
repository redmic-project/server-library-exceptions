package es.redmic.exception.dto;

import java.util.HashMap;

public class ErrorTypeDTO {
	
	private String code;
	private String description;
	private HashMap<String, String> fieldErrors;
	
	public ErrorTypeDTO() {
	}
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String codeS) {
		code = codeS;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String descriptionS) {
		description = descriptionS;
	}

	public HashMap<String, String> getFieldErrors() {
		return fieldErrors;
	}

	public void setFieldErrors(HashMap<String, String> fieldErrors) {
		this.fieldErrors = fieldErrors;
	}
}
