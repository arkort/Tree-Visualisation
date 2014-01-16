package com.epam.hackathon.trees.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String login() {
		System.out.println("Test commit to git");
		System.out.println("Test commit to git2");
		return "index";
	}

}
