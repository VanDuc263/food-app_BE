package org.example.food_app_be.repository;

import org.example.food_app_be.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


public interface ProductRepository extends MongoRepository<Product,String> {
    Optional<Product> findById(String s);
//    Optional<Product> findByName(String name);
}
