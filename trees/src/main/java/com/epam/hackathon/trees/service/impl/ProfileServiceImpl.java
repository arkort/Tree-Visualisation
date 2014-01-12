package com.epam.hackathon.trees.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.epam.hackathon.trees.dao.ProfileDao;
import com.epam.hackathon.trees.domain.Profile;
import com.epam.hackathon.trees.service.ProfileService;

@Service("profileService")
public class ProfileServiceImpl implements ProfileService{
	
	@Resource
	ProfileDao profileDao;

	@Override
	public Profile createProfile(String firstName, String lastName, long id) {
		return profileDao.create(new Profile(firstName, lastName, id));
	}

}
