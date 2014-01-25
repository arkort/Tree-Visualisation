package com.epam.hackathon.trees.web.model;

public class ProfileModel {
	
	private String firstName;
	private String lastName;
	private String employeeId;
	private TreeModel treeModel;
	
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
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public TreeModel getTreeModel() {
		return treeModel;
	}
	public void setTreeModel(TreeModel treeModel) {
		this.treeModel = treeModel;
	}
}
