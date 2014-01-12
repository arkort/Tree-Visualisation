package com.epam.hackathon.trees.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.epam.hackathon.trees.controller.db.MongoConfiguration;
import com.epam.hackathon.trees.controller.db.domain.Tree;

@Controller("/profile")
public class ProfileController {
	

	@RequestMapping(value="saveTree", method = RequestMethod.POST)
	public void saveTree() {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(MongoConfiguration.class);
		MongoOperations mongoOperation = (MongoOperations)ctx.getBean("mongoTemplate");
		Tree tree = new Tree();
		tree.setId(1);
		tree.setName("AAA");
		mongoOperation.save(tree);
		mongoOperation.remove(tree);
	}
	
	@RequestMapping(value="removeTree", method = RequestMethod.POST)
	public void removeTree() {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(MongoConfiguration.class);
		MongoOperations mongoOperation = (MongoOperations)ctx.getBean("mongoTemplate");
		Tree tree = new Tree();
		tree.setId(1);
		tree.setName("AAA");
		mongoOperation.save(tree);
		mongoOperation.remove(tree);
	}
}
