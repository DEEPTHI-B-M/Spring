package com.examples.SpringJDBCDemo;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.examples.SpringJDBCDemo.dao.EmployeeDAO;


public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("JDBCTemplate Demo");
    	//create();
        readAllEmployees();
    }
    
    private static void create() {
    	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/examples/SpringJDBCDemo/springconfig.xml");
        EmployeeDAO employeeDao=(EmployeeDAO)ctx.getBean("employeedao"); 
        Employee emp1=new Employee();
        emp1.setId(2);
        emp1.setFirstName("Divya");
        emp1.setLastName("Shree");
        
        employeeDao.create(emp1);
        
     
    }
    
    private static void delete() {
    	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/examples/SpringJDBCDemo/springconfig.xml");
        EmployeeDAO employeeDao=(EmployeeDAO)ctx.getBean("employeedao"); 
        employeeDao.delete(2);
    }
    
    private void update() {
    	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/examples/SpringJDBCDemo/springconfig.xml");
        EmployeeDAO employeeDao=(EmployeeDAO)ctx.getBean("employeedao"); 
        Employee emp1=new Employee();
        emp1.setId(2);
        emp1.setFirstName("Deepthi");
        emp1.setLastName("Sharma");
        
        employeeDao.create(emp1);
    }
    
    private static void readAllEmployees() {
    	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/examples/SpringJDBCDemo/springconfig.xml");
        EmployeeDAO employeeDao=(EmployeeDAO)ctx.getBean("employeedao"); 
        List<Employee>employees=employeeDao.read();
        System.out.println(employees);
    }
    
    private static void readOneEmployee() {
    	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/examples/SpringJDBCDemo/springconfig.xml");
        EmployeeDAO employeeDao=(EmployeeDAO)ctx.getBean("employeedao"); 
        Employee employee=employeeDao.read(1);
        System.out.println(employee);
    }
}
