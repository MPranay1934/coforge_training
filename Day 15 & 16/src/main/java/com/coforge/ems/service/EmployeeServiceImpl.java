package com.coforge.ems.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.coforge.ems.exception.EmployeeNotFoundException;
import com.coforge.ems.exception.InvalidEmployeeObjectException;
import com.coforge.ems.model.Employee;
import com.coforge.ems.repo.EmployeeRepo;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepo repo;
	
	public EmployeeServiceImpl(EmployeeRepo repo) {
		super();
		this.repo = repo;
	}
	
	@Override
	public boolean saveEmployee(Employee employee) throws InvalidEmployeeObjectException {
		
		if(employee != null && employee.getEid() > 0 && employee.getEname() != null && employee.getEsalary() > 0 && employee.getDno() > 0) {
			
			
			repo.save(employee);
			return true;
		}
		else {
			throw new InvalidEmployeeObjectException();
		}
	}
		
		public boolean updateEmployee(int eid, Employee employee) throws InvalidEmployeeObjectException {
			
			if(eid > 0 && employee != null && employee.getEid() > 0 && employee.getEname() != null && employee.getEsalary() > 0 && employee.getDno() > 0) {
				
				
				repo.save(employee);
				return true;
			}
			else {
				throw new InvalidEmployeeObjectException();
			}
	}
		@Override
		public boolean deleteByEid(int eid) throws InvalidEmployeeObjectException {

		    if (eid > 0) {

		        repo.deleteById(eid);
		        return true;

		    } else {

		        throw new InvalidEmployeeObjectException();

		    }
		}
	

		@Override
		public Optional<Employee> findByEid(int eid) throws InvalidEmployeeObjectException, EmployeeNotFoundException {
			if (eid > 0) {
				if(!repo.existsById(eid)) {
					throw new EmployeeNotFoundException();
				}
				Optional<Employee> employee = repo.findById(eid);
				return employee;
			} else {
				throw new InvalidEmployeeObjectException();
			}
		}

		@Override
		
		public List<Employee> findAllEmployees()
		        throws EmployeeNotFoundException, InvalidEmployeeObjectException {

		    List<Employee> employees = (List<Employee>) repo.findAll();

		    if (employees.isEmpty()) {
		        throw new EmployeeNotFoundException();
		    }

		    return employees;
		}

		@Override
		public List<Employee> findByEname(String ename) throws InvalidEmployeeObjectException {
			// TODO Auto-generated method stub
			if(ename == null)
				throw new InvalidEmployeeObjectException();
			List<Employee> employee = repo.findByEname(ename);
			return employee;
		}
		
		@Override
		
		public boolean deleteByEname(String ename) throws EmployeeNotFoundException {
			if(ename != null) {
				int n = repo.deleteByEname(ename);
				if(n == 0) {
					throw new EmployeeNotFoundException();
			}else {
				return true;
			}
				}
			return false;
	}
		
		@Override
		public List<Integer> getEidsList() {
			List<Integer> eids = repo.getEids();
			return eids;
		}

		@Override
		public String getInfo() {
			return repo.getInfo();
		}

		
}
