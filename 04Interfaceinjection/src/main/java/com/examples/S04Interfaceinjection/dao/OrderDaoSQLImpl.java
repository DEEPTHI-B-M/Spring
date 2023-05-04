package com.examples.S04Interfaceinjection.dao;

import org.springframework.stereotype.Component;

@Component("orderdaosql")
public class OrderDaoSQLImpl implements OrderDAO{
	

	@Override
	public void createOder() {
		System.out.println("open connection");
		System.out.println("Run insert statement");
		System.out.println("Order created");
		
		
	}

}
