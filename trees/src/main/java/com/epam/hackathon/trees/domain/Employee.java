package com.epam.hackathon.trees.domain;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.Indexed;
import org.springframework.data.neo4j.annotation.NodeEntity;

@NodeEntity
public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3393727615949963353L;
	
	@GraphId
	@Indexed(fieldName = "EmployeeId")
	private long employeeId;
	
	@Indexed(fieldName = "FirstName")
	private String firstName;
	@Indexed(fieldName = "LastName")
	private String lastName;
	private String location;
	private List<String> projects;

	private List<String> hobbys;
	
	public Employee() {
	}

	public Employee(String firstName, String lastName, long id, String location, List<String> projects) {
		setFirstName(firstName);
		setLastName(lastName);
		setEmployeeId(id);
		setLocation(location);
		setProjects(projects);
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

	public List<String> getHobbys() {
		return hobbys;
	}

	public void setHobbys(List<String> hobbys) {
		this.hobbys = hobbys;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<String> getProjects() {
		return projects;
	}

	public void setProjects(List<String> projects) {
		this.projects = projects;
	}
	
}
