package com.zbq.dao;

import org.apache.ibatis.annotations.Select;

import com.zbq.bean.Employee;

public interface EmployeeMapperAnnotation {
	
	@Select("select * from employee where id=#{id}")
	public Employee getEmpById(Integer id);
}
