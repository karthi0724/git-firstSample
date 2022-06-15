package com.crud.example.controller;

import java.util.List;
import java.util.Optional;

import javax.persistence.PostLoad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.example.Entity.EmployeeData;
import com.crud.example.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

	@Autowired
	private EmployeeService ser;
	
	@PostMapping("save")
	public EmployeeData saveEmpData(@RequestBody @Validated EmployeeData emp) {
		System.out.println(emp.getFName());
	
		return ser.saveEmp(emp);
		
	}
	
	@GetMapping("/getAll")
	public List<EmployeeData> getAllEmp(){
		return ser.getAll();
	}
	
	@GetMapping("/getId/{id}")
	public Optional<EmployeeData> getByIdEmp(@PathVariable int id){
		return ser.getByIdDetails(id);
		
	}
	/*
	 * @GetMapping("/findName/{fName}") public EmployeeData getByfName(@PathVariable
	 * String fName) { return ser.getByFirtstNameDetails(fName); }


Test this code for Git
	 */
	
	
}
