package com.dyoung.springapp;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	UsersDao userDao;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String home() {
		logger.info("Login!");
		return "login";
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcome() {
		logger.info("Welcome!");
		List<User> users = userDao.findAll();
		
		for(User user : users) {
			logger.info("HERE:" + user.getUsername());
		}
		System.getProperties().list(System.out);
		return "welcome";
	}
	
	@RequestMapping(value = "/alive", method = RequestMethod.GET)
	@ResponseBody
	public String alive() {
		logger.info("Alive!");
		return "1";
	}
}
