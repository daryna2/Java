package com.company;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
    public boolean newCustomer(String customerName, double initialTransaction) {
if(findCustomer(customerName) == null) {
    Customer newCustomer = new Customer(customerName,initialTransaction);
    this.customers.add(newCustomer);
    return true;

}
        System.out.println("Customer already exist");
return false;
    }
    public boolean addCustomerTransaction(String customerName, double initialTransaction) {
        Customer customer = findCustomer(customerName);
        if(customer !=null) {
            customer.addTransaction(initialTransaction);
            return true;
        }
        System.out.println("Customer not found");
return false;

    }
    public Customer findCustomer(String customerName) {
        for(int i = 0; i<customers.size(); i++){
            String name = customers.get(i).getName();
            if(name.equals(customerName)) {
                return customers.get(i);
            }
        }
        return null;
    }
}
