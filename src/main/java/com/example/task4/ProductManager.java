package com.example.task4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    private final String filePath;

    public ProductManager(String filePath) {
        this.filePath = filePath;
    }

    public void saveProducts(List<Product> products) {
        try (FileOutputStream fos = new FileOutputStream(filePath);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(products);
            System.out.println("Products saved successfully to " + filePath);
        } catch (IOException e) {
            System.err.println("Error while saving products: " + e.getMessage());
        }
    }

    public List<Product> loadProducts() {
        List<Product> products = new ArrayList<>();

        try (FileInputStream fis = new FileInputStream(filePath);
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            products = (List<Product>) ois.readObject();
            System.out.println("Products loaded successfully from " + filePath);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error while loading products: " + e.getMessage());
        }
        return products;
    }
}