package com.stas.JavaOOP.testuser;

/**
 * Created by Stas on 19.07.2017.
 */
public class Creator {
    private String name;

    Creator(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void talk(){
        System.out.println("my name is " + this.name);
    }

    public Product createProduct(String name){
        return new Product(name, this);
    }
}
