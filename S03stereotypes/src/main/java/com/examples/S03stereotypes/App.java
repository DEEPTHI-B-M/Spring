package com.examples.S03stereotypes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	 ClassPathXmlApplicationContext ctx=new   ClassPathXmlApplicationContext("com/examples/S03stereotypes/springconfig.xml");
    	 Instructor instructor=(Instructor)ctx.getBean("instructor");
         System.out.println(instructor);
    }
}
