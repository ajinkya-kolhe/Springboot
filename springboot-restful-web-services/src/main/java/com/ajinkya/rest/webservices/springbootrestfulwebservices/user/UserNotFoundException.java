package com.ajinkya.rest.webservices.springbootrestfulwebservices.user;

// Not required when exceptions are centralised 
// @ResponseStatus(code = HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {

	public UserNotFoundException(String message) {
		super(message);
	}

}
