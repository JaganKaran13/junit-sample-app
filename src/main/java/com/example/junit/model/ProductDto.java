package com.example.junit.model;

import lombok.Data;

@Data
public class ProductDto {

    private int id;

    private String description;

    private double price;

    public ProductDto() {
        this.id=123;
        this.description="Sample";
        this.price=20.12;
    }
}