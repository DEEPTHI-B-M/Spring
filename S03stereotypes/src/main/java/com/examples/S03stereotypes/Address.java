package com.examples.S03stereotypes;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	
	@Value("Mysore")
	private String city;
	
	@Value("Karnataka")
	private String state;
	
	@Value("649300")
	private String pincode;

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
	}
	
	


	
}
