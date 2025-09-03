package com.docks.springbootwithdocker.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.docks.springbootwithdocker.entity.Employee;
import com.docks.springbootwithdocker.repo.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Employee saveEmployees(Employee emp) {
		
		
		Employee save = this.employeeRepository.save(emp);
		
		
		return save;
		
	}

	
public List<Employee> getEmployees() {
		
		
		
		
		
		return this.employeeRepository.findAll();
		
	}
}
