package com.zbq.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

//@Alias("dept")
@Data
@AllArgsConstructor
public class Department {
	
	private Integer id;
	private String departmentName;
	private List<Employee> emps;

	public Department() {
		super();
	}

	public Department(Integer id, String departmentName) {
		this.id = id;
		this.departmentName = departmentName;
	}
}
