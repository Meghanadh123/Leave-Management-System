package com.klef.jfsd.springboot.service;

import java.util.List;

import com.klef.jfsd.springboot.model.HR;
import com.klef.jfsd.springboot.model.Leave;

public interface HRService
{
//	public String addhr (HR hr);
    public String updatehr(HR hr);
   public HR viewhrbyid(int eid);
	public String deleteempbyhr(int eid);
	public HR checkhrlogin(String email, String password);
	public String applyleave(Leave leave);
	public List<Leave> hrleavestatus(String name);
//	List<Leave> hrappliedleaves(String name);

}
