package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.model.User;
@Service
public class UserServiceAdapter implements UserService {

		List<User> list = List.of(
				
					new User(101L, "adnan", "1000"),
					new User(102L,"vedant","2000"),
					new User(103L,"emir","3000")
				);
				
	
	@Override
	public User getUser(Long userId) {
		// TODO Auto-generated method stub
		return this.list.stream().filter(user->userId.equals(userId)).findAny().orElse(null);
	}

}
