package com.example.junit.service;

import com.example.junit.controller.ProductFeign;
import com.example.junit.model.ProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProductService {

    @Autowired
    private ProductFeign productFeign;

    public ProductDto getProductById(int productId) {
        System.out.println("get Product");
        ProductDto productDto= productFeign.getProductById(productId);
        return productDto;
    }
}
