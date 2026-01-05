package org.example.food_app_be.controller;

import org.example.food_app_be.model.Product;
import org.example.food_app_be.repository.ProductRepository;
import org.example.food_app_be.service.ProductService;
import org.springframework.data.mongodb.repository.Query;
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

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable String id){
        return productService.getProductById(id);
    }

    @GetMapping("/search")
    public List<Product> searchProducts(@RequestParam("query") String query){
        return this.productService.searchProducts(query);
    }
    @GetMapping("/promotions")
    public List<Product> getPromotionalProducts() {
        return productService.getPromotionalProducts();
    }
    @GetMapping("/category/{categoryId}")
    public List<Product> getProductsByCategoryId(@PathVariable String categoryId) {
        return productService.findByDanhMucId(categoryId);
    }

}
