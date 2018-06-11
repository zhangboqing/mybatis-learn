package com.zbq.dao;

import com.zbq.bean.Employee;
import org.apache.ibatis.annotations.Select;


public interface EmployeeMapperAnnotation {
	
	@Select("select * from employee where id=#{id}")
	public Employee getEmpById(Integer id);
}
