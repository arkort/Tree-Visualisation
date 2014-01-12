package com.epam.hackathon.trees.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.epam.hackathon.trees.dao.TreeDao;
import com.epam.hackathon.trees.domain.Tree;

@Service("treeService")
public class TreeServiceImpl {
	@Resource
	TreeDao treeDao;
	
	public Tree createTree() {
		return null;
	}

}
