package com.company;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transaction;

    public Customer(String name,double initialTransaction) {
        this.name = name;
        this.transaction = new ArrayList<>();
        transaction.add(initialTransaction);
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Double> getTransaction() {
        return this.transaction;
    }
    public void  addTransaction(double transaction) {
        this.transaction.add(transaction);
    }

}
