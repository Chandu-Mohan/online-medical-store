package com.company;

public class DeliveryAgent extends Entity{
    public int zipCode;
    public int numberOfProductsDelevared;
    public DeliveryAgent(int id, String name, int zipCode,int numberOfProductsDelevared) {
        super(id, name);
        this.zipCode=zipCode;
        this.numberOfProductsDelevared=numberOfProductsDelevared;
    }
}
