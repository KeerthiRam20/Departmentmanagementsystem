package com.ems.in.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.validation.constraints.NotEmpty;



@Entity
public class Department {
	
	
	    @Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
      private int departid;
	 @NotEmpty(message="departmentname is required")
      private String departname;
	 
	 
      public Department() {
      }
      
      public Department (int departid, String departname) {
    	  this.setDepartid(departid);
    	  this.setDepartname(departname);
      }

	public int getDepartid() {
		return departid;
	}

	public void setDepartid(int departid) {
		this.departid = departid;
	}

	public String getDepartname() {
		return departname;
	}

	public void setDepartname(String departname) {
		this.departname = departname;
	}

	public Department get() {
		// TODO Auto-generated method stub
		return null;
	}

	}

	
      

