package com.zbq.bean;

import lombok.Data;

@Data
public class Employee {
	
	private Integer id;
	private String lastName;
	private String email;
	private String gender;
	//员工状态
	private EmpStatus empStatus=EmpStatus.LOGOUT;
	
	
	public Employee(String lastName, String email, String gender) {
		super();
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
