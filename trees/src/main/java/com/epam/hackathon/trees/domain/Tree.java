package com.epam.hackathon.trees.domain;

import java.util.List;

import org.springframework.data.neo4j.annotation.NodeEntity;

@NodeEntity
public class Tree extends AbstractDomain {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4159692784420300170L;
	
	public Tree() {
	}
	
	private List<Long> knownProfiles;
	
	public List<Long> getKnownProfiles() {
		return knownProfiles;
	}
	public void setKnownProfiles(List<Long> knownProfiles) {
		this.knownProfiles = knownProfiles;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((knownProfiles == null) ? 0 : knownProfiles.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tree other = (Tree) obj;
		if (knownProfiles == null) {
			if (other.knownProfiles != null)
				return false;
		} else if (!knownProfiles.equals(other.knownProfiles))
			return false;
		return true;
	}
	
}
