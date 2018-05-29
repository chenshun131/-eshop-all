package com.chenshun.userservice.controller;

import java.util.List;

import com.chenshun.userservice.model.User;
import com.chenshun.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/findAllUsers")
	public List<User> findAllUsers() {
		return userService.findAllUsers();
	}
	
}
