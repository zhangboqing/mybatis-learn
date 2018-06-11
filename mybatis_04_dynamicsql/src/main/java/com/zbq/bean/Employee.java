package com.zbq.bean;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Alias("emp")
@Data
public class Employee {
	
	private Integer id;
	private String lastName;
	private String email;
	private String gender;
	private Department dept;
	
	public Employee() {
		super();
	}
	
	
	
	public Employee(Integer id, String lastName, String email, String gender,
			Department dept) {
		super();
		this.id = id;
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
		this.dept = dept;
	}



	public Employee(Integer id, String lastName, String email, String gender) {
		super();
		this.id = id;
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
	}
	
	
	


}
