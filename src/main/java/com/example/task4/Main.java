package com.example.task4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Soap", 3.55, 10));
        products.add(new Product("Toothpaste", 5.6, 20));
        ProductManager productManager = new ProductManager("products.txt");
        productManager.saveProducts(products);
        List<Product> loadedProducts = productManager.loadProducts();
        for (Product product : loadedProducts) {
            System.out.println(product);
        }
    }
}