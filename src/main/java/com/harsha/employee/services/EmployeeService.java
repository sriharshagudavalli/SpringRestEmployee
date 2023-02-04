package com.harsha.employee.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harsha.employee.models.Employee;
import com.harsha.employee.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	public EmployeeRepository employeeeRepository;
	
	public List<Employee> getAllEmployees(){
		return (List<Employee>) employeeeRepository.findAll();
	}
	
	public void addEmployee(Employee employee) {
		employeeeRepository.save(employee);
	}
	
	public void updateEmployee(Long id, Employee employee) {
		employeeeRepository.save(employee);
	}
	
	public void deleteEmployee(Long id) {
		employeeeRepository.deleteById(id);
	}
}
