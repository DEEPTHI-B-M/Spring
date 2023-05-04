package com.examples.SpringJDBCDemo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.examples.SpringJDBCDemo.Employee;
import com.examples.SpringJDBCDemo.rowmapper.EmployeeRowMapper;

@Component("employeedao")
public class EmployeeDaoImpl implements EmployeeDAO{
	
	@Autowired
	public JdbcTemplate jdbcTemplate;

	@Override
	public int create(Employee employee) {
		String sql="insert into employee values (?,?,?)";
		int result= jdbcTemplate.update(sql,employee.getId(),employee.getFirstName(),employee.getLastName());
		return result;
	}

	@Override
	public int delete(int id) {
		String sql="delete from employee where id=?";
		int result=jdbcTemplate.update(sql,id);
		return 0;
	}

	@Override
	public int update(Employee employee) {
		String sql="update employee set firstname=?,lastname=? where id=?";
		int result= jdbcTemplate.update(sql,employee.getId(),employee.getFirstName(),employee.getLastName());
		return result;
	}

	@Override
	public Employee read(int id) {
		String sql="Select * from employee where id=?";
		EmployeeRowMapper employeeRowMapper=new EmployeeRowMapper();
		Employee employee=jdbcTemplate.queryForObject(sql, employeeRowMapper,id);
		return employee;
	}

	@Override
	public List<Employee> read() {
		String sql="Select * from employee";
		EmployeeRowMapper employeeRowMapper=new EmployeeRowMapper();
		List<Employee>employees=jdbcTemplate.query(sql,employeeRowMapper);
		return employees;
	}
	
}
