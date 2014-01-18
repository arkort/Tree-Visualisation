package com.epam.hackathon.trees.dao;

import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.stereotype.Repository;

import com.epam.hackathon.trees.domain.Tree;

@Repository("treeDao")
public interface TreeDao extends GraphRepository<Tree> {
}
