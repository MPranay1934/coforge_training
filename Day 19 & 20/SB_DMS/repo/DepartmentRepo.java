package com.coforge.dms.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.coforge.dms.model.Department;

public interface DepartmentRepo extends CrudRepository<Department,Integer>{

	Optional<Department> findByDno(int dno);

}
