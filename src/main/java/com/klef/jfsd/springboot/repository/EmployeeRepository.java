package com.klef.jfsd.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.springboot.model.Employee;
import com.klef.jfsd.springboot.model.Leave;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	@Query("select e from Employee e where e.email=?1 and e.password=?2")
	public Employee checkemplogin(String name , String pwd);
	
	@Query("SELECT l FROM Leave l WHERE  l.lname = ?1")
	public List<Leave> employeeappliedleaves(String name);
	
}
