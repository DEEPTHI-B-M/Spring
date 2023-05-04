package com.examples.S08SpringMVCORM.service;

import java.util.List;

import com.examples.S08SpringMVCORM.entity.User;

public interface UserService {
	int save(User user);
	List<User> getUsers();
}
