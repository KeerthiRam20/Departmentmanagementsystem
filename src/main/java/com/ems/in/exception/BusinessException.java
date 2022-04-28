package com.ems.in.exception;

import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus
public class BusinessException extends Exception {




	private static final long serialVersionUID = 1L;

	public BusinessException(String message){
    	super(message);
    }
}