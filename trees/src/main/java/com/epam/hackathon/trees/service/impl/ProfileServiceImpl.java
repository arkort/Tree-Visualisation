package com.epam.hackathon.trees.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.epam.hackathon.trees.dao.ProfileDao;
import com.epam.hackathon.trees.domain.Profile;
import com.epam.hackathon.trees.service.ProfileService;

@Service("profileServiceNeo4j")
public class ProfileServiceImpl implements ProfileService{
	
	@Resource
	ProfileDao profileDao;
	
	@Override
	public Profile createProfile(String firstName, String lastName, long id) {
//		return profileDao.create(new Profile(firstName, lastName, id));
		return profileDao.save(new Profile(firstName, lastName, id));
	}

	@Override
	public List<Profile> getAllProfiles() {
		return profileDao.findAll().as(List.class);
	}

}
