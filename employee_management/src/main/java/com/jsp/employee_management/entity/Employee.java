package com.jsp.employee_management.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String Fname,Mname,Lname,pwd,gender;
	@Column(unique = true)
	private String email;
	private int age;
	private long phone;
	private String address;
	@OneToMany(cascade = CascadeType.ALL)
	List<EducationDetails> edu;
	@OneToMany(cascade = CascadeType.ALL)
	List<Expericence>exp;
	

}
