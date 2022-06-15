package com.crud.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.example.DAO.EmployeeDao;
import com.crud.example.Entity.EmployeeData;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao dao;
	
	public EmployeeData saveEmp(EmployeeData emp) {
		return dao.save(emp);
	}
	
	public List<EmployeeData> getAll(){
		return dao.findAll();
	}
	
	public Optional<EmployeeData> getByIdDetails(int id) {
		return dao.findById(id);
	}
	/*
	 * public EmployeeData getByFirtstNameDetails(String fName) { return
	 * dao.findByFName(fName); }
	 */
}
