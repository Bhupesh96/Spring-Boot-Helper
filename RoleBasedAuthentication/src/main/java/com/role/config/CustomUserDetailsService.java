package com.role.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.role.entity.User;
import com.role.repo.UserRepo;

public class CustomUserDetailsService implements UserDetailsService {
	
	@Autowired
	private UserRepo repo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user = repo.findByEmail(username);
		if(user == null) {
			throw new UsernameNotFoundException("User not found!!");
		} else {
			return new CustomUser(user);
		}
	}

}
