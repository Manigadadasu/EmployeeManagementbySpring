package com.jsp.employee_management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jsp.employee_management.dao.EmployeeDao;
import com.jsp.employee_management.entity.Employee;
import com.jsp.employee_management.util.ResponseStructure;

@Service
public class EmployeeService {
	@Autowired
	EmployeeDao dao;
	
	public ResponseEntity<ResponseStructure<Employee>> saveEmp(Employee e){
		ResponseStructure<Employee> rs = new ResponseStructure<Employee>();
		rs.setStatuscode(HttpStatus.CREATED.value());
		rs.setData(dao.saveEmp(e));
		rs.setMsg("User Sved Successfully");
		
		return new ResponseEntity<ResponseStructure<Employee>>(rs,HttpStatus.CREATED);
		
	}
	
	

}
