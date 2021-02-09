package com.apcfss.dao;

import java.util.List;

import com.apcfss.model.EmployeeDetails;

public interface EmployeeDetailsDao {
	
	public boolean createEmployee(EmployeeDetails emp);
	public int delete(int id);
	public List<EmployeeDetails> getEmployees();
	 public EmployeeDetails getEmpById(int id);
	public String edit(EmployeeDetails emp);
	
	
} 
