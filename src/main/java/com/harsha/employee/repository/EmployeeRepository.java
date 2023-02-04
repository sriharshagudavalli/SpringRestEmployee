package com.harsha.employee.repository;

import org.springframework.data.repository.CrudRepository;

import com.harsha.employee.models.Employee;

//import org.springframework.data.jpa.repository.JpaRepository;
//
//public interface EmployeeRepository extends JpaRepository<Employee,Long>  {}

public interface EmployeeRepository extends CrudRepository<Employee, Long>{}