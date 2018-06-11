package com.zbq.bean;

import lombok.Data;

import java.util.List;

/**
 * 封装分页查询数据
 * @author lfy
 *
 */
@Data
public class OraclePage {
	
	private int start;
	private int end;
	private int count;
	private List<Employee> emps;
	
}
