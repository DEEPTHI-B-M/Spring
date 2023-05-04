package com.example.S10SpringBootDemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.S10SpringBootDemo.dao.Somedao;

@Component
public class SomeService {
	@Autowired
	Somedao somedao;
	
	public void create() {
		somedao.hello();
	}
}
