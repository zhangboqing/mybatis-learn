package com.zbq.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.apache.ibatis.type.Alias;

@Alias("emp")
@Data
@ToString
@AllArgsConstructor
public class Employee {


	private Integer id;
	private String lastName;
	private String email;
	private String gender;
	private Integer dId;
	private Department dept;

	public Employee() {
		super();
	}

	public Employee(Long id, String lastName, String email, String gender,Integer dId) {
		super();
		this.id = Integer.valueOf(id.toString());
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
		this.dId = dId;
	}


}
