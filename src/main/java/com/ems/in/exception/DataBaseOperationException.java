package com.ems.in.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
@ResponseStatus
public class DataBaseOperationException extends Exception {


	private static final long serialVersionUID = 1L;

	public DataBaseOperationException(String message){
    	super(message);
    }
}