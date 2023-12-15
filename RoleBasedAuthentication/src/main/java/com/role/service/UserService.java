package com.role.service;

import com.role.entity.User;

public interface UserService {

	public User saveUser(User user);
	public void removeSessionMessage();
}
