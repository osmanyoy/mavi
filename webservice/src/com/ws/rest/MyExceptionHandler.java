package com.ws.rest;

import javax.validation.ValidationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class MyExceptionHandler implements ExceptionMapper<Throwable>{

	@Override
	public Response toResponse(Throwable exp) {
		if (exp instanceof ValidationException) {
			ValidationException validationException = (ValidationException)exp;
			String message = validationException.getMessage();
			MyError error = new MyError();
			error.setMsg(message);
			error.setCause(100);
			return Response.status(Status.BAD_REQUEST).entity(error).build();
		}
		return Response.status(Status.BAD_GATEWAY).entity(exp.getMessage()).build();
	}

}
