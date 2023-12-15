package com.role.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.role.entity.User;
import java.util.List;


public interface UserRepo extends JpaRepository<User, Integer> {

	public User findByEmail(String email);
}
