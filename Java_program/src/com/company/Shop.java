package com.company;

import java.util.HashMap;

public class Shop extends Entity {
    public int zipCode;
    //created a HashMap to save Inventory (name mapped to number)
    public HashMap <String,Integer> inventory = new HashMap<String,Integer>();
    public Shop(int id, String name, int zipCode) {
        super(id, name);
        this.zipCode= zipCode;
    }
}
