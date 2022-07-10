package com.company;
import java.util.TreeSet;

public class Manufacturer extends Entity{
    public TreeSet<String> setOfProducts = new TreeSet<String>();//Creating a set to save list of products
    public Manufacturer(int id, String name) {
        super(id, name);
    }
}
