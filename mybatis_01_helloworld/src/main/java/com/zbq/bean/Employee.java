package com.zbq.bean;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(doNotUseGetters = true)
public class Employee {
	
	private Integer id;
	private String lastName;
	private String email;
	private String gender;

}
