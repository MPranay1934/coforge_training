package com.coforge.dms.service;

import java.util.List;
import java.util.Optional;

import com.coforge.dms.model.Department;

import jakarta.validation.Valid;

public interface DepartmentService {


	public List<Department> findAllDepartments();

	Optional<Department> findDeptByDno(int dno);

}
