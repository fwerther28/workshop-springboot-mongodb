package com.fwerther28.workshopmongodb.resources.exception;

import java.io.Serializable;

public class ObjectNotFoundException extends RuntimeException implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public ObjectNotFoundException(String msg) {
		super(msg);
	}
}
