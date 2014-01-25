package com.epam.hackathon.trees.relations;

import java.util.List;

import org.springframework.data.neo4j.annotation.RelationshipEntity;

import com.epam.hackathon.trees.domain.AbstractDomain;

@RelationshipEntity
public class Know extends AbstractDomain {

	List<String> hobbys;
}
