package com.ws.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(name = "EmployeeWebService", targetNamespace = "http://turcell.com",serviceName="EmployeeWebServiceService")
@XmlSeeAlso({ ObjectFactory.class })
public class MyTestClass {

	@WebMethod
	@WebResult(name = "employee", targetNamespace = "")
	@RequestWrapper(localName = "getEmployee", targetNamespace = "http://turcell.com", className = "com.ws.client.GetEmployee")
	@ResponseWrapper(localName = "getEmployeeResponse", targetNamespace = "http://turcell.com", className = "com.ws.client.GetEmployeeResponse")
	public Employee getEmployee(@WebParam(name = "employeeId", targetNamespace = "") long employeeId)
	        throws MyException_Exception {
		Employee employee = new Employee();
		employee.setIsim("test1");
		employee.setPhone("3984934");
		employee.setSurname("yaya");
		employee.setAge(48);
		return employee;
	}

    @WebMethod
    @RequestWrapper(localName = "insertEmployee", targetNamespace = "http://turcell.com", className = "com.ws.client.InsertEmployee")
    @ResponseWrapper(localName = "insertEmployeeResponse", targetNamespace = "http://turcell.com", className = "com.ws.client.InsertEmployeeResponse")
    public void insertEmployee(
        @WebParam(name = "employee", targetNamespace = "", mode = WebParam.Mode.INOUT)
        Holder<Employee> employee) {
    	
    }

}
