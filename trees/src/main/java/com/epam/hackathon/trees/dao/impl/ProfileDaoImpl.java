package com.epam.hackathon.trees.dao.impl;

import org.springframework.stereotype.Repository;

import com.epam.hackathon.trees.dao.ProfileDao;
import com.epam.hackathon.trees.domain.Profile;

@Repository("profileDao")
public class ProfileDaoImpl extends CrudDaoImpl<Profile> implements ProfileDao {

}
