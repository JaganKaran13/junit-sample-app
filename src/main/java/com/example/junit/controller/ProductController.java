package com.example.junit.controller;

import com.example.junit.model.ProductDto;
import com.example.junit.service.ProductService;
import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("product")
public class ProductController {

    private ProductService productService;

    ProductController(ProductService productService) {this.productService = productService;}

    @GetMapping("/{id}")
    public ProductDto getProduct(@PathVariable("id") int id) {
        return this.productService.getProductById(id);
    }
}
