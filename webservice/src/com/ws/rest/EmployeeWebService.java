package com.ws.rest;

import javax.ejb.EJB;
import javax.jws.HandlerChain;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(targetNamespace = "http://turcell.com")
@HandlerChain(file="handler-chain.xml")
public class EmployeeWebService {

	@EJB
	private EmployeeDAO empDAO;

	@WebMethod
	@WebResult(name = "employee", partName = "employeeResponse")
	public Employee getEmployee(@WebParam(name = "employeeId") long employeeId) throws MyException {
		Employee findEmployee = empDAO.findEmployee(employeeId);
		if (findEmployee == null) {
			MyError error = new MyError();
			error.setCause(100);
			error.setMsg("Gönderdiðiniz id yok");
			throw new MyException(error);
		}
		return findEmployee;
	}

	@WebMethod
	@WebResult(name = "employee", partName = "employeeInsertResponse")
	public Employee insertEmployee(@WebParam(name = "employee") Employee employee) {
		return empDAO.insertEmployee(employee);
	}

}
