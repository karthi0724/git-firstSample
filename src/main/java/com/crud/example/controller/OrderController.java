package com.crud.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.example.DAO.CustomerDAO;
import com.crud.example.Dto.CustomerDTO;
import com.crud.example.Dto.OrderRequest;
import com.crud.example.Entity.Customer;
import com.crud.example.service.CustomerService;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private CustomerService ser;

	@Autowired
	private CustomerDAO dao;

	@PostMapping("/saveCust")
	public Customer saveOrder(@RequestBody Customer ord) {
		return ser.saveCustomer(ord);
	}

	public Customer saveOrder2(@RequestBody OrderRequest ord) {
		return dao.save(ord.getCustomer());
	}

	@PostMapping("/save")
	public Customer saveCustCustomer(@RequestBody Customer cust) {
		return dao.save(cust);
	}
	
	@GetMapping("/getAllCust")
	public ResponseEntity< List<Customer>> getAllCustDet(){
		List<Customer> c= ser.getAllDetails();
		return new ResponseEntity<>(c, HttpStatus.OK);
	}
	@GetMapping("/getId/{id}")
public Optional<Customer> getByIdCust(@PathVariable Integer id) {
	return ser.getByIdDetails(id);
}
	@PostMapping("/updateCst")
	public Customer updateCustomerDetails(@RequestBody Customer cst) {
		return ser.updateCust(cst);
	}
	
	
	public CustomerDTO saveCustDTO(@RequestBody CustomerDTO dto) {
		
		Customer c=new Customer();
		
		BeanUtils.copyProperties(dto, c);
		 c=dao.save(c);
		
		BeanUtils.copyProperties(c, dto);
		return dto;
		
	}
}
