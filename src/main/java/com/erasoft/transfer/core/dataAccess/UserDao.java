package com.erasoft.transfer.core.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import com.erasoft.transfer.core.entities.User;

public interface UserDao extends JpaRepository<User,Integer>{

	User findByEmail(String email);
	
	
}
