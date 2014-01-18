package com.epam.hackathon.trees.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.epam.hackathon.trees.domain.Profile;
import com.epam.hackathon.trees.service.ProfileService;

@Controller//("/profile")
public class ProfileController {
	@Resource
	ProfileService profileService;
	
	@ResponseBody
	@RequestMapping(value="saveProfile", method = RequestMethod.POST)
	public void saveProfile() {
		profileService.createProfile("a", "d", 1);
	}
	@ResponseBody
	@RequestMapping(value="getAllProfiles", method = RequestMethod.GET)
	public List<Profile> getProfile() {
		return profileService.getAllProfiles();
	}
}
