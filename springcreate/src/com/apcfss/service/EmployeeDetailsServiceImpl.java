package com.apcfss.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apcfss.dao.EmployeeDetailsDao;
import com.apcfss.model.EmployeeDetails;
@Service("employeeservice")
public  class EmployeeDetailsServiceImpl implements EmployeeDetailsService
{
	@Autowired
	EmployeeDetailsDao employeedao;
	
 public boolean createEmployee(EmployeeDetails emp) {
	
	 
	 
	 
	return employeedao.createEmployee(emp);
}


public List<EmployeeDetails> getEmployees(){
	return employeedao.getEmployees();
	
}


public EmployeeDetails getEmpById(int id) {
	// TODO Auto-generated method stub
	return employeedao.getEmpById(id);
}


public int delete(int id) {
	// TODO Auto-generated method stub
	return employeedao.delete(id);
}


public String edit(EmployeeDetails emp) {
	System.out.println("iam excuted");
	
	return employeedao.edit(emp) ;
}
}
