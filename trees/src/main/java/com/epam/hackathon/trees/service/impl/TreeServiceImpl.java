package com.epam.hackathon.trees.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.epam.hackathon.trees.dao.TreeDao;
import com.epam.hackathon.trees.domain.Tree;

@Service("treeServiceNeo4j")
public class TreeServiceImpl {
	@Resource
	TreeDao treeDao;
	
	public Tree createTree() {
		return null;
	}

}
