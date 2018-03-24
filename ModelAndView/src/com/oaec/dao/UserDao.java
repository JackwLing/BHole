package com.oaec.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.oaec.entity.User;

@Repository
public interface UserDao {
	
	public User getUser(@Param("name") 
			String name,@Param("pass") String pass);
	
}
