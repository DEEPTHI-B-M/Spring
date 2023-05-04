package com.examples.SpringJDBCDemo.dao;

import java.util.List;

import com.examples.SpringJDBCDemo.Employee;

public interface EmployeeDAO {
	int create(Employee employee);
	int delete(int id);
	int update(Employee employee);
	Employee read(int id);
	List<Employee> read();
}
