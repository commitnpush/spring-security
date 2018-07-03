package com.inc.security.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.inc.security.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	private static final Logger logger = 
			LoggerFactory.getLogger(UserController.class);
	
	@RequestMapping(value="/user/login", method=RequestMethod.GET)
	public String login(
			@RequestParam(required=false) String error,
			@RequestParam(required=false) String logout,
			Model model) {
		if(error != null) {
			model.addAttribute("error",
						   "Invalid username and password!");
		}
		if(logout != null) {
			model.addAttribute("msg", 
						"You've been logged out successfully.");
		}
		return "/user/login.jsp";
	}
}
