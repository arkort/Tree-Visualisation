package com.epam.hackathon.trees.dao;

import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.stereotype.Repository;

import com.epam.hackathon.trees.domain.Profile;

@Repository("profileDao")
public interface ProfileDao extends GraphRepository<Profile> {

//	Profile create(Profile profile);
}
