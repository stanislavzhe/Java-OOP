package com.stas.JavaOOP.testuser;

/**
 * Created by Stas on 19.07.2017.
 */
public class Product {
    private String productName;
    private Creator creator;

    public Product(String productName, Creator creator) {
        this.productName = productName;
        this.creator = creator;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", creator=" + creator.getName() +
                '}';
    }
}
