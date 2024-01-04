package com.productapi.productapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productapi.productapi.model.ProductModel;
import com.productapi.productapi.repository.ProductRepository;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<ProductModel> getAll() {
        return productRepository.findAll();
    }

    public Optional<ProductModel> getId(Integer id) {
        return productRepository.findById(id);
    }

    public ProductModel add(ProductModel productModel) {
        return productRepository.save(productModel);
    }

    public void delete(Integer id) {
        productRepository.deleteById(id);
    }

    public ProductModel update(Integer id, ProductModel product) {
        product.setId(id);
        return productRepository.save(product);
    }

}
