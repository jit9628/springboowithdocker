package com.docks.springbootwithdocker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.docks.springbootwithdocker.entity.Employee;
import com.docks.springbootwithdocker.services.EmployeeService;

@RestController
public class TestController {
	@Autowired
	private EmployeeService employeeService;
	@GetMapping
	public String testData() {
		return "Docker Images Tested";
	}

	
	@PostMapping("/save")
	public Employee saveData(@RequestBody Employee employee) {
		return this.employeeService.saveEmployees(employee);
	}
	
	
	@GetMapping("/g")
	public List<Employee> getEmployeetData() {
		return this.employeeService.getEmployees();
	}
}
