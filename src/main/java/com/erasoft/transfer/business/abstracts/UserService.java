package com.erasoft.transfer.business.abstracts;

import com.erasoft.transfer.core.entities.User;
import com.erasoft.transfer.core.utilities.results.DataResult;
import com.erasoft.transfer.core.utilities.results.Result;
import com.erasoft.transfer.entities.concretes.Car;

public interface UserService {
	
	Result add(User user);

	DataResult<User> findByEmail(String email);
}
