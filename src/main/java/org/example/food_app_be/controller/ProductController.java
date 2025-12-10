package org.example.food_app_be.controller;

import org.example.food_app_be.model.Product;
import org.example.food_app_be.repository.ProductRepository;
import org.example.food_app_be.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private final ProductService productService;
    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getAll(){
        return this.productService.getAll();
    }

    @GetMapping("/search")
    public Optional<Product> findByName(@RequestParam String name){
        return this.productService.findByName(name);
    }
}
