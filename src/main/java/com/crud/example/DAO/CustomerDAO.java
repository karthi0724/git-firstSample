package com.crud.example.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.example.Entity.Customer;

@Repository
public interface CustomerDAO extends JpaRepository<Customer, Integer>{

}
