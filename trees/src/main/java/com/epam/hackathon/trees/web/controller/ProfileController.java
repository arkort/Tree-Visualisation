package com.epam.hackathon.trees.web.controller;

import java.util.LinkedList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.epam.hackathon.trees.domain.Employee;
import com.epam.hackathon.trees.service.EmployeeService;

@Controller
public class ProfileController {
	@Resource
	EmployeeService profileService;
	
	@ResponseBody
	@RequestMapping(value="saveProfile", method = RequestMethod.POST)
	public void saveProfile() {
		List<String> list = new LinkedList<String>();
		list.add("EPMS");
		profileService.create("a", "d", 1, "Saratov", list);
	}
	@ResponseBody
	@RequestMapping(value="getAllProfiles", method = RequestMethod.GET)
	public List<Employee> getProfile() {
		return profileService.getAll();
	}
}
