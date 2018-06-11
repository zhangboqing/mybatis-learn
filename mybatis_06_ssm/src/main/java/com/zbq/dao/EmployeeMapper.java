package com.zbq.dao;

import com.zbq.bean.Employee;

import java.util.List;

public interface EmployeeMapper {
    Employee getEmpById(Integer var1);

    List<Employee> getEmps();
}
