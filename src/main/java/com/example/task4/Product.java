package com.example.task4;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
public class Product implements Serializable {
    private String name;
    private double productPrice;
    private int stockQuantity;

    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + productPrice + ", stockQuantity=" + stockQuantity + "]";
    }
}