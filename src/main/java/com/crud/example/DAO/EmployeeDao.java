package com.crud.example.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.example.Entity.EmployeeData;
@Repository
public interface EmployeeDao extends JpaRepository<EmployeeData, Integer>{

	//EmployeeData findByfName(String fName);

	//EmployeeData findByFName(String fName);

}
