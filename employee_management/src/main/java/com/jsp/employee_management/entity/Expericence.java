package com.jsp.employee_management.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Expericence {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int exp_id;
	private String CompanyName;
	private String YearOfExp,MonthOfExp;
	private String Designation;
	
	

}
