package com.ws.rest;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Session Bean implementation class EmployeeDAO
 */
@Stateless
@LocalBean
public class EmployeeDAO {

	@PersistenceContext(unitName = "JPA_Lesson1")
	private EntityManager entityManager;

	public EmployeeDAO() {
	}

	public Employee insertEmployee(Employee employee) {
		entityManager.persist(employee);
		return employee;
	}

	public void updateEmployee(Employee employee) {
		entityManager.merge(employee);
	}

	public void deleteEmployee(long empId) {
		Employee employee = findEmployee(empId);
		entityManager.remove(employee);
	}

	public Employee findEmployee(long empId) {
		return entityManager.find(Employee.class,
		                          empId);
	}

}
