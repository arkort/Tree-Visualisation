package com.epam.hackathon.trees.domain;

import java.io.Serializable;

import org.springframework.data.neo4j.annotation.GraphId;


public class AbstractDomain implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4551765809372600719L;
	
	
	public AbstractDomain() {
	}
	
	@GraphId
	Long graphId;
}
