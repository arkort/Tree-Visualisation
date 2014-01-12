package com.epam.hackathon.trees.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.epam.hackathon.trees.service.ProfileService;

@Controller("/profile")
public class ProfileController {
	
	@Resource
	ProfileService profileService;

	@RequestMapping(value="saveTree", method = RequestMethod.POST)
	public void saveTree() {
//		ApplicationContext ctx = new AnnotationConfigApplicationContext(MongoConfiguration.class);
//		MongoOperations mongoOperation = (MongoOperations)ctx.getBean("mongoTemplate");
//		Tree tree = new Tree();
//		tree.setId(1);
//		tree.setName("AAA");
//		mongoOperation.save(tree);
//		mongoOperation.remove(tree);
	}
	
	@RequestMapping(value="removeTree", method = RequestMethod.POST)
	public void removeTree() {
//		ApplicationContext ctx = new AnnotationConfigApplicationContext(MongoConfiguration.class);
//		MongoOperations mongoOperation = (MongoOperations)ctx.getBean("mongoTemplate");
//		Tree tree = new Tree();
//		tree.setId(1);
//		tree.setName("AAA");
//		mongoOperation.save(tree);
//		mongoOperation.remove(tree);
	}
	
	@RequestMapping(value="saveProfile", method = RequestMethod.POST)
	public void saveProfile() {
		profileService.createProfile("a", "d", 1);
	}
}
