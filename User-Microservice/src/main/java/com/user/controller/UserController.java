package com.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.user.model.User;
import com.user.service.UserServiceAdapter;

@RestController
@RequestMapping("/user")
public class UserController {
		@Autowired
		private UserServiceAdapter userServiceAdapter;
		@Autowired
		private RestTemplate restTemplate;
	
		@GetMapping("/{userId}")
		public User getUser(@PathVariable("userId") Long userId) {
			 User user = this.userServiceAdapter.getUser(userId);
			 
			 List list = this.restTemplate.getForObject("http://contact-microservice/contact/"+user.getUserId(),List.class);
			 user.setUserContacts(list);
			 return user;
		}
		
}
