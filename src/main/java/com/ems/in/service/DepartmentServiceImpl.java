package com.ems.in.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;

import com.ems.in.entity.Department;
import com.ems.in.repo.IDepartmentRepository;


@Service
public  class DepartmentServiceImpl implements IDepartmentService {

	@Autowired
	private IDepartmentRepository idepartmentRepository;
	
	@Override
	public Department saveDepartment(Department department) {
			return idepartmentRepository.save(department);
	}

	@Override
	public List<Department> getAllDepartments() {
		return idepartmentRepository.findAll();
	}
	

	//@Override
	//public Optional<User> getUserById(Integer departid) {
			//return userRepo.findById(departid);
//	}

	@Override
	public Optional<Department> deleteDepartment(Integer departid) {
		idepartmentRepository.deleteById(departid);
          return null;
	}


	@Override
	public Department updateDepartment(Department department) {
		return idepartmentRepository.save(department);
	}

	public IDepartmentRepository getIdepartmentRepository() {
		return idepartmentRepository;
	}

	public void setIdepartmentRepository(IDepartmentRepository idepartmentRepository) {
		this.idepartmentRepository = idepartmentRepository;
	}

	@Override
	public Optional<Department> getDepartmentById(Integer departid) {
		// TODO Auto-generated method stub
		return idepartmentRepository.findById(departid);
	}

	@Override
	public Optional<Department> findById(Integer departid) {
		// TODO Auto-generated method stub
		return idepartmentRepository.findById(departid);
	}
//real
	@Override
	public int getDepartmentCount() 
	{
		return (int) idepartmentRepository.count();
	}
	

}