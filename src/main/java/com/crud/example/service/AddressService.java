package com.crud.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.example.DAO.AddressDAO;
import com.crud.example.Entity.Address;

@Service
public class AddressService {
@Autowired
	private AddressDAO adrsDao;

public Address saveAdres(Address adrs) {
	return adrsDao.save(adrs);
}
	
}
