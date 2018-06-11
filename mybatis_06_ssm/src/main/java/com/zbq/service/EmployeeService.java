package com.zbq.service;

import com.zbq.bean.Employee;
import com.zbq.dao.EmployeeMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;
    @Autowired
    private SqlSession sqlSession;

    public EmployeeService() {
    }

    public List<Employee> getEmps() {
        return this.employeeMapper.getEmps();
    }
}
