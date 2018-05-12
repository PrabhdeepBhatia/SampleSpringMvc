package com.admin.dao;

import com.admin.model.Login;
import com.admin.model.User;

public interface UserDao {

void register(User user);
	  
User validateUser(Login login);
	
}
