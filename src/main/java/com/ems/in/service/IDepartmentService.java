package com.ems.in.service;

import java.util.List;
import java.util.Optional;

import com.ems.in.entity.Department;


public interface IDepartmentService {
	
	
	Department saveDepartment(Department department);
	Optional<Department> getDepartmentById(Integer departid);
	List<Department> getAllDepartments();
	public Optional<Department> deleteDepartment(Integer departid);
	public Department updateDepartment(Department department);
	Optional<Department> findById(Integer departid);
	
	
	public int getDepartmentCount();
	
}
