package com.zbq.bean;

import lombok.Data;
import lombok.ToString;
import org.apache.ibatis.type.Alias;

@Alias("emp")
@Data
@ToString
public class Employee {
	
	private Integer id;
	private String lastName;
	private String email;
	private String gender;
	

}
