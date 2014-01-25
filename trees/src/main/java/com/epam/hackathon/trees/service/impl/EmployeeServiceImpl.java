package com.epam.hackathon.trees.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.epam.hackathon.trees.dao.EmployeeDao;
import com.epam.hackathon.trees.domain.Employee;
import com.epam.hackathon.trees.relations.Know;
import com.epam.hackathon.trees.service.EmployeeService;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService{
	
	@Resource
	EmployeeDao employeeDao;
	
	@Override
	public Employee create(String firstName, String lastName, long id, String location, List<String> projects) {
		return employeeDao.save(new Employee(firstName, lastName, id, location, projects));
	}

	@Override
	public List<Employee> getAll() {
		return employeeDao.findAll().as(List.class);
	}
	@Override
	public void deleteAll() {
		employeeDao.deleteAll();
	}
	@Override
	public void addHobby(long employeeId, String hobby) {
		Employee employee = employeeDao.findOne(employeeId);
		employee.getHobbys().add(hobby);
		employeeDao.save(employee);
	}
	
	public void createConnection(long initiator, long affegted) {
		Employee empl1 = employeeDao.findOne(initiator);
		Employee empl2 = employeeDao.findOne(affegted);
		employeeDao.createRelationshipBetween(empl1, empl2, Know.class, Know.class.getSimpleName());
	}
}
