package com.stas.JavaOOP.testuser;

/**
 * Created by Stas on 19.07.2017.
 */
public class runner {
    public static void main(String[] args) {
        Creator creator = new Creator("John");
        Product product = creator.createProduct("new Product");
        System.out.println(product);
    }
}
