package com.coforge.ems.service;

import java.sql.SQLException;
import java.util.List;

import com.coforge.ems.dao.EmployeeDAO;
import com.coforge.ems.exception.InvalidEmployeeObjectException;
import com.coforge.ems.model.Employee;

public class EmployeeService {
	private EmployeeDAO dao = new EmployeeDAO();
	
	public int createEmployee(Employee employee) throws ClassNotFoundException, SQLException , InvalidEmployeeObjectException {
		int n = 0;
		if(employee != null && employee.getEid() > 0 && employee.getEname() != null && employee.getEsalary() > 0) {
			n = dao.createEmployee(employee);
		}
		else {
			throw new InvalidEmployeeObjectException();
			
		}
		return n;
	}
	public boolean updateEmployeeSalary(int eid, int salary)
	        throws ClassNotFoundException, SQLException {

	    EmployeeDAO dao = new EmployeeDAO();

	    return dao.updateEmployeeSalary(eid, salary);
	}
	public boolean deleteEmployee(int deleteId)
	        throws ClassNotFoundException, SQLException {

	    EmployeeDAO dao = new EmployeeDAO();

	    return dao.deleteEmployee(deleteId);
	}
	public List<Employee> findAllEmployee() throws ClassNotFoundException, SQLException {
		return dao.findAllEmployee();
		
	}
	public Employee findEmployeeById(int eid) throws ClassNotFoundException, SQLException  {
		EmployeeDAO dao = new EmployeeDAO();
		return dao.findEmployeeById(eid);
	}
	
	

}
