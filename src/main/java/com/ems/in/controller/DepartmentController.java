package com.ems.in.controller;

import java.util.List;
import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ems.in.entity.Department;
import com.ems.in.exception.ApplicationNotFoundException;

import com.ems.in.exception.BusinessException;
import com.ems.in.exception.DataBaseOperationException;
import com.ems.in.service.IDepartmentService;

@RestController
@RequestMapping(value = "/department")
public class DepartmentController {
	
	@Autowired
	private IDepartmentService idepartmentService;

	@PostMapping(value = "/save")
	public ResponseEntity<Department> saveDepartment(@RequestBody Department department) 
			throws BusinessException,ApplicationNotFoundException,DataBaseOperationException
			
	{
				return new ResponseEntity<Department>(idepartmentService.saveDepartment(department),HttpStatus.CREATED);
		}
	@GetMapping(value = "/alldepartments")
	public ResponseEntity<List<Department>> getAllDepartments()
	{
		List<Department> allDepartments = idepartmentService.getAllDepartments();
		return new ResponseEntity<List<Department>>(allDepartments,HttpStatus.OK);
	}
	
	
	
	@DeleteMapping(value = "/{departid}")
	public ResponseEntity<String> deleteDepartment(@PathVariable Integer departid) 
			throws ApplicationNotFoundException,BusinessException
	{
		idepartmentService.deleteDepartment(departid);
			String msg = "User with ID: "+departid+"Deleted Successfully";
			return new ResponseEntity<String>(msg,HttpStatus.OK);
		
		
	}	
	
	

	
	
	@GetMapping(value="/{departid}")
	public Department getDepartment(@PathVariable Integer departid) throws ApplicationNotFoundException
	{
		Optional<Department> opt =idepartmentService.findById(departid);
		if(opt.isPresent())
		{
			Department department=opt.get();
			return department;
		}
		else
		{
			throw new ApplicationNotFoundException("Department with given id:" +departid+ "Not available");
		}
		
		
	}
	
	@GetMapping(value="{/count")
	public ResponseEntity<Integer> getDepartmentCount() throws ApplicationNotFoundException,DataBaseOperationException
	{
	   int department_count = idepartmentService.getDepartmentCount();
	   return new ResponseEntity<Integer>(department_count, HttpStatus.OK);
	}
}