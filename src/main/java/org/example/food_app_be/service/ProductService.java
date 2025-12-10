package org.example.food_app_be.service;

import org.example.food_app_be.model.Product;
import org.example.food_app_be.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final ProductRepository productRepository;
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    public List<Product> getAll(){
        return productRepository.findAll();
    }
    public  Product save(Product product){
        return productRepository.save(product);
    }
    public Optional<Product> findByName(String name){
        return productRepository.findByName(name);
    }
    public Optional<Product> findById(String id){
        return productRepository.findById(id);
    }
}
