package com.zbq.controller;

import com.zbq.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    public EmployeeController() {
    }

    @RequestMapping({"/getemps"})
    public String emps(Map<String, Object> map) {
        List emps = this.employeeService.getEmps();
        map.put("allEmps", emps);
        return "list";
    }
}
