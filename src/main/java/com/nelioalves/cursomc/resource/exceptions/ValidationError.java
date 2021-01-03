package com.nelioalves.cursomc.resource.exceptions;

import java.util.List;

public class ValidationError extends StandardError {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<FieldMessage> errors;

	public ValidationError() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ValidationError(Integer status, String msg, Long timeStamp) {
		super(status, msg, timeStamp);
		// TODO Auto-generated constructor stub
	}

	public List<FieldMessage> getErrors() {
		return errors;
	}

	public void addError(String fieldName, String menssagem) {

		errors.add(new FieldMessage(fieldName, menssagem));

	}

}
