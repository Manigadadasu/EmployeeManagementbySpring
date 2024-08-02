package com.jsp.employee_management.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.jsp.employee_management.clone.Employeee;
import com.jsp.employee_management.entity.Employee;
import com.jsp.employee_management.service.EmployeeService;
import com.jsp.employee_management.util.ResponseStructure;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService service;
	@Autowired
	ModelMapper mapper;
	@PostMapping("/save")
	public Employeee emp(@RequestBody Employee e){
		Employeee m = mapper.map(e, Employeee.class);
		return m;
		
		
		
		
		
		
		
	}

}
