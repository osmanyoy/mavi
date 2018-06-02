package com.ws.rest;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.validation.Valid;
import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

@Path("/my")
@WebService(targetNamespace="http://turcell")
public class MyFirstRest {

	@GET
	public String hello(@QueryParam("isim") String name,
	                    @QueryParam("soy") String surname) {
		return "hello "
		       + name
		       + " "
		       + surname;
	}

	@POST
	public String hello2() {
		return "hello world 2";
	}

	@Path("/h3/{isim}/surname/{soy}")
	@PUT
	public String hello3(@PathParam("isim") String name,
	                     @PathParam("soy") String surname,
	                     @QueryParam("yas") int age) {
		return "hello world "
		       + name
		       + " "
		       + surname
		       + " "
		       + age;
	}

	@Path("/h4")
	@GET
	public String hello4(@HeaderParam("isim") String name,
	                     @HeaderParam("soy") String surname,
	                     @MatrixParam("yas") int age) {
		return "hello world 4 : "
		       + name
		       + " "
		       + surname
		       + " "
		       + age;
	}

	@Path("/h5")
	@POST
	public String hello5(@FormParam("isim") String name,
	                     @FormParam("soy") String surname,
	                     @FormParam("yas") int age) {
		return "hello world 5 : "
		       + name
		       + " "
		       + surname
		       + " "
		       + age;
	}

	@Path("/h6/{soy}")
	@GET
	public String hello6(@BeanParam Employee employee) {
		return "hello world 6 : "
		       + employee.getName()
		       + " "
		       + employee.getSurname()
		       + " "
		       + employee.getAge();
	}

	@Path("/h7")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public String hello7(Employee employee) {
		return "hello world 7 : "
		       + employee.getName()
		       + " "
		       + employee.getSurname()
		       + " "
		       + employee.getAge();
	}

	@Path("/h8")
	@POST
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Employee hello8(@Valid Employee employee) {
		employee.setName("mehmet");
		return employee;
	}

	@Path("/h9")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@WebMethod(exclude=true)
	public Response hello9(Employee employee) {
		if (employee.getName()== null || employee.getName().isEmpty()) {
			MyError error = new MyError();
			error.setCause(100);
			error.setMsg("çalýþsan ismi boþ olamaz");
			return Response.status(Status.BAD_REQUEST).entity(error).build();
		}
		employee.setName("mehmet");
		return Response.ok().entity(employee).build();
	}

}
