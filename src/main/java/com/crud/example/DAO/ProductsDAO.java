package com.crud.example.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.example.Entity.Products;

@Repository
public interface ProductsDAO extends JpaRepository<Products, Integer> {

}
