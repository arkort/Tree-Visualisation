package com.epam.hackathon.trees.controller.db;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import com.mongodb.MongoClient;

@Configuration
public class MongoConfiguration {

	public @Bean
	MongoDbFactory mongoDbFactory() throws Exception {
		return new SimpleMongoDbFactory(new MongoClient("localhost", 27017), "test");
	}
 
	public @Bean
	MongoTemplate mongoTemplate() throws Exception {
		MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory());
		return mongoTemplate;
	}
}
