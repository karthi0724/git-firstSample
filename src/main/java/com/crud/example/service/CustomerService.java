package com.crud.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.example.DAO.CustomerDAO;
import com.crud.example.Entity.Customer;

@Service
public class CustomerService {

	@Autowired
	private CustomerDAO dao;
	
	public Customer saveCustomer(Customer customer) {
		return dao.save(customer);
	}
	
	public Customer saveCustCustomer(Customer cust) {
		return dao.save(cust);
	}
	
	public List<Customer> getAllDetails() {
		return dao.findAll();
		
	}
	
	public Optional<Customer> getByIdDetails(Integer id) {
		return dao.findById(id);
	}
	
	public Customer updateCust(Customer cst) {
		Customer c =dao.findById(cst.getId()).orElse(null);
		//Customer c=new Customer();
		if(cst!=null) {
		
				c.setEmail(cst.getEmail());
				c.setFirstName(cst.getFirstName());
				return dao.save(c);
			
		}
		return null;
		
	}
	
}
