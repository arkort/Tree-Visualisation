package com.epam.hackathon.trees.domain;

import org.springframework.data.neo4j.annotation.Indexed;
import org.springframework.data.neo4j.annotation.NodeEntity;

@NodeEntity
public class Profile extends AbstractDomain {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7921942518781646275L;
	@Indexed
	private String firstName;
	private String lastName;
	private long employeeId;

	private long treeId;
	
	public Profile() {
	}

	public Profile(String firstName, String lastName, long id) {
		setFirstName(firstName);
		setLastName(lastName);
		setEmployeeId(id);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public long getTreeId() {
		return treeId;
	}

	public void setTreeId(long treeId) {
		this.treeId = treeId;
	}

}
