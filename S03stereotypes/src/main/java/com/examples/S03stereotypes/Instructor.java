package com.examples.S03stereotypes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Instructor {
	@Value("12")
	private int id;
	
	@Value("Max")
	private String name;
	
	@Autowired
	private Address homeaddress;

	@Override
	public String toString() {
		return "instructor [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
