package com.jsp.employee_management.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class EducationDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int edu_id;
	private String Degree,stream,CollegeName;
	private String yop;
	private double percentage;
	

}
