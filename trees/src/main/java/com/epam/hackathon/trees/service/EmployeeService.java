package com.epam.hackathon.trees.service;

import java.util.List;

import com.epam.hackathon.trees.domain.Employee;


public interface EmployeeService {

//	Employee create(String firstName, String lastName, long id);
	
	List<Employee> getAll();

	void deleteAll();

	Employee create(String firstName, String lastName, long id,
			String location, List<String> projects);

	void addHobby(long employeeId, String hobby);

}
