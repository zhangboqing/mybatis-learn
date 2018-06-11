package com.zbq.bean;

import lombok.Data;

import java.util.List;

@Data
public class Department {
	
	private Integer id;
	private String departmentName;
	private List<Employee> emps;
	

	public Department(Integer id) {
		super();
		this.id = id;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	

}
