package com.dyoung.springapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String home() {
		logger.info("Login!");
		return "login";
	}
	
	@RequestMapping(value = "/alive", method = RequestMethod.GET)
	@ResponseBody
	public String alive() {
		logger.info("Alive!");
		return "1";
	}
}
