package com.apcfss.service;

import java.util.List;

import com.apcfss.model.EmployeeDetails;

public interface EmployeeDetailsService {
	
	public boolean createEmployee(EmployeeDetails emp);
	public int delete(int id);
	public List<EmployeeDetails> getEmployees();
	public EmployeeDetails getEmpById(int id);
	public String edit(EmployeeDetails emp);
}
