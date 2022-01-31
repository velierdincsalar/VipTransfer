package com.erasoft.transfer.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erasoft.transfer.business.abstracts.UserService;
import com.erasoft.transfer.core.dataAccess.UserDao;
import com.erasoft.transfer.core.entities.User;
import com.erasoft.transfer.core.utilities.results.DataResult;
import com.erasoft.transfer.core.utilities.results.Result;
import com.erasoft.transfer.core.utilities.results.SuccessDataResult;
import com.erasoft.transfer.core.utilities.results.SuccessResult;

@Service
public class UserManager implements UserService {
	
	private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public Result add(User user) {
		this.userDao.save(user);
		return new SuccessResult("Kullanıcı eklenddi");
	}

	@Override
	public DataResult<User> findByEmail(String email) {
		
		return new SuccessDataResult<User>(this.userDao.findByEmail(email),"Kullanıcı bulundu");
	}

}
