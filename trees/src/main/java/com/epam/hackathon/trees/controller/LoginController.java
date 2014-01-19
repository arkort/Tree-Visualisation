package com.epam.hackathon.trees.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String login() {
		System.out.println("Test commit to git");
		return "index";
	}
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String signin() {
		return "login";
	}
	
	@RequestMapping(value = "/signfail", method = RequestMethod.GET)
	public String signinFailure() {
		return "login";
	}
	
}
