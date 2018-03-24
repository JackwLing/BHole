package com.oaec.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oaec.dao.UserDao;
import com.oaec.entity.User;
import com.oaec.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Resource
	private UserDao userDao;
	
	@Override
	public User getUser(String username, String password) {
		
		return userDao.getUser(username, password);
	}
	
	/*@Override
	@Transactional
	public boolean transfer(String out, String in, double money) {
		
		int flag = 0;
		int a = 10;
		
		flag = userDao.updateBalance(out, money) ;
			   a= 1/0 ;
		flag = userDao.updateBalance(in, -money)+flag;
		
		return flag==2;
	}*/
	
}
