package com.epam.hackathon.trees.dao.impl;

import org.springframework.stereotype.Repository;

import com.epam.hackathon.trees.dao.TreeDao;
import com.epam.hackathon.trees.domain.Tree;

@Repository("treeDao")
public class TreeDaoImpl extends CrudDaoImpl<Tree> implements TreeDao {

}
