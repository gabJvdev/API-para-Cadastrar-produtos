package com.productapi.productapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.productapi.productapi.model.ProductModel;

@Repository
public interface ProductRepository extends JpaRepository<ProductModel, Integer> {

}
