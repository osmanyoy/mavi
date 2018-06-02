package com.xml;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class XmlParsing {
	
	public static void main(String[] args) {
		try {
			JAXBContext context = JAXBContext.newInstance(EmployeeList.class);
			Marshaller createMarshaller = context.createMarshaller();
			
			Employee employee = new Employee();
			employee.setName("osman");
			employee.setSurname("yaycioglu");
			employee.setPhone("5435022313");
			employee.setAge(48);
			
			Address address = new Address();
			address.setCity("Istanbul");
			address.setTown("atasehir");
			
			employee.setAddress(address);
			

			Employee employee2 = new Employee();
			employee2.setName("osman");
			employee2.setSurname("yaycioglu");
			employee2.setPhone("5435022313");
			employee2.setAge(48);
			
			Address address2 = new Address();
			address2.setCity("Istanbul");
			address2.setTown("umraniye");
			
			employee2.setAddress(address2);

			List<Employee> emps = new ArrayList<>();
			emps.add(employee);
			emps.add(employee2);
			
			EmployeeList employeeList = new EmployeeList();
			employeeList.setEmployees(emps);

			createMarshaller.marshal(employeeList, System.out);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	
}
