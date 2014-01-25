package com.epam.hackathon.trees.dao;

import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.data.neo4j.repository.RelationshipOperationsRepository;
import org.springframework.stereotype.Repository;

import com.epam.hackathon.trees.domain.Employee;

@Repository("employeeDao")
public interface EmployeeDao extends GraphRepository<Employee>, RelationshipOperationsRepository<Employee> {
}
