package com.zbq.dao;

import com.zbq.bean.Employee;
import com.zbq.bean.OraclePage;

import java.util.List;

public interface EmployeeMapper {
	
	public Employee getEmpById(Integer id);
	
	public List<Employee> getEmps();
	
	public Long addEmp(Employee employee);
	
	public void getPageByProcedure(OraclePage page);
}
