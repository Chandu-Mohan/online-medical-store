package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Customer extends Entity {
    public int zipCode;
    //creating a HashMap to save List of purchases(name mapped to number of pieces)
    public HashMap<String, Integer> ListOfPurchases= new HashMap<String, Integer>();

    public Customer(int id, String name, int zipCode) {
        super(id, name);
        this.zipCode= zipCode;
    }
}
