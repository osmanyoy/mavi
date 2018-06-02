package com.ws.rest;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.ValidationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class MyExceptionHandler2 implements ExceptionMapper<ConstraintViolationException>{

	@Override
	public Response toResponse(ConstraintViolationException exp) {
		Set<ConstraintViolation<?>> constraintViolations = exp.getConstraintViolations();
		StringBuilder stringBuilder = new StringBuilder();
		
		for (ConstraintViolation<?> constraintViolation : constraintViolations) {
			stringBuilder.append(constraintViolation.getMessage());
			stringBuilder.append("---");
		}
		MyError error = new MyError();
		error.setCause(303);
		error.setMsg(stringBuilder.toString());
		return Response.status(Status.BAD_GATEWAY).entity(error).build();
	}

}
