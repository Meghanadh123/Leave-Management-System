package com.klef.jfsd.springboot.service;

import java.util.List;

import com.klef.jfsd.springboot.model.Admin;
import com.klef.jfsd.springboot.model.Employee;
import com.klef.jfsd.springboot.model.HR;
import com.klef.jfsd.springboot.model.Leave;

public interface AdminService {
	public List<Employee> viewallemps();
	public Employee viewempbyid(int eid);
	public String deleteemp(int eid);
	public Admin checkadminlogin(String uname,String pwd);
	public long employeecount();//count(*)
	public int updatestatus(int eid, boolean status);
	public List<Leave> viewallleaves();
	public String addhr(HR h);
	public int updateleavestatus(int sno, boolean status);
	public List<Leave> approvedleaves();
	public List<Leave> rejectedleaves();
	public List<HR> viewallhr();
	public HR viewhrbyid(int hid);
	public String deletehr(int hid);
	long hcount();
		
}
