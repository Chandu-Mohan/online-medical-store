package com.company;

public class Product extends  Entity {

    String ma;
    public Product(int id, String name,String ma) {
        super(id, name);
        this.ma=ma;
    }
}
