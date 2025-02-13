package com.example.Apiintro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Apiintro.entity.*;
import com.example.Apiintro.service.EmployeeService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name="Book api", description = "user realed api")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/test")
	public String test() {
		return "Sucess";
	}
	
	@Operation(summary = "Add Data")
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee);
	}
   
	@Operation(summary = "Get Data")
	@GetMapping("/employee")
	public List<Employee> listEmployee() {
		return employeeService.listEmployee();
	}
	
	@Operation(summary = "Get Data based on ID")
	@GetMapping("/employee/{id}")
	public Employee fetchEmployeeById(@PathVariable("id") Long employeeID) {
		return employeeService.fetchEmployeeById(employeeID);
	}

	@Operation(summary = "Delete Data")
	@DeleteMapping("/employee/{id}")
	public String deleteEmployee(@PathVariable("id") Long employeeID) {
		return employeeService.deleteEmployee(employeeID);
	}

}