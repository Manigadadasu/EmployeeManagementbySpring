package com.jsp.employee_management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.employee_management.entity.Employee;
import com.jsp.employee_management.service.EmployeeService;
import com.jsp.employee_management.util.ResponseStructure;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService service;
	
	public ResponseEntity<ResponseStructure<Employee>> emp(@RequestBody Employee e){
		return service.saveEmp(e);
		
	}

}
