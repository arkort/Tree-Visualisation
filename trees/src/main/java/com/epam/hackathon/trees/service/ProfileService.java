package com.epam.hackathon.trees.service;

import java.util.List;

import com.epam.hackathon.trees.domain.Profile;


public interface ProfileService {

	Profile createProfile(String firstName, String lastName, long id);
	
	List<Profile> getAllProfiles();

}
