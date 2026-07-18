package com.coforge.ems.service;

import java.util.List;
import java.util.Optional;

import com.coforge.ems.exception.EmployeeNotFoundException;
import com.coforge.ems.exception.InvalidEmployeeObjectException;
import com.coforge.ems.model.Employee;

public interface EmployeeService {

	public boolean saveEmployee(Employee employee) throws InvalidEmployeeObjectException;

	public boolean updateEmployee(int eid, Employee employee) throws InvalidEmployeeObjectException;

	public boolean deleteByEid(int eid)throws InvalidEmployeeObjectException;

	public Optional<Employee> findByEid(int eid) throws EmployeeNotFoundException,InvalidEmployeeObjectException;

	public List<Employee> findAllEmployees() throws EmployeeNotFoundException,InvalidEmployeeObjectException;

	public List<Employee> findByEname(String ename)throws InvalidEmployeeObjectException;

	public boolean deleteByEname(String ename) throws InvalidEmployeeObjectException, EmployeeNotFoundException;
	
	public List<Integer> getEidsList();

	public String getInfo();

}
