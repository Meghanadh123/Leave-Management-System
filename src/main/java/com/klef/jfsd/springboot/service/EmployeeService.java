package com.klef.jfsd.springboot.service;

import java.util.List;

import com.klef.jfsd.springboot.model.Employee;
import com.klef.jfsd.springboot.model.Leave;
public interface EmployeeService {
	public String addemployee(Employee emp);
	public String updateemployee(Employee emp);
	public Employee viewemployeebyid(int eid);
	public Employee checkemplogin(String email,String pwd);
	public String applyleave(Leave leave);
	public List<Leave> employeeappliedleaves(String name);
	
	
	
	
	
	
}
