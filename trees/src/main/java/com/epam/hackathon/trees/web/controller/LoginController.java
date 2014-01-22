package com.epam.hackathon.trees.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index() {
		return "index";
	}
	
	@RequestMapping(value = {"/signin","/","/login"}, method = RequestMethod.GET)
	public String signin() {
		return "login";
	}
	
	@RequestMapping(value = "/signfail", method = RequestMethod.GET)
	public String signinFailure(Model model) {
		model.addAttribute("error", "Bad Credential");
		return "login";
	}
}
