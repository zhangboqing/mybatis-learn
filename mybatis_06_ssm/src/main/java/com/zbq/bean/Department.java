package com.zbq.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Department implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String departmentName;
    private List<Employee> emps;

    public Department(Integer id) {
        this.id = id;
    }

    public Department() {
    }

}
