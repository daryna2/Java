package com.company;


import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            Branch newBranch = new Branch(branchName);
            this.branches.add(newBranch);
            System.out.println("Branch name " + branchName + " was added");
            return true;
        }
        System.out.println("This branch already exist");
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            branch.newCustomer(customerName, initialTransaction);
            return true;

        }
        System.out.println("Branch doesn't exist");
        return false;
    }


    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            branch.addCustomerTransaction(customerName, transaction);
            return true;
        }
        System.out.println("Branch doesn't exist");
        return false;
    }


    public Branch findBranch(String branchName) {
        for (int i = 0; i < branches.size(); i++) {
            String branch = branches.get(i).getName();
            if (branch.equals(branchName)) {
                return this.branches.get(i);
            }
            return null;
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean printTransaction) {
        Branch branch = findBranch(branchName);
        if (branch != null && printTransaction) {
            for (int i = 0; i < branch.getCustomers().size(); i++) {
                System.out.println("Customer " + branch.getCustomers().get(i).getName() + "[" + (i + 1) + "] ");

                System.out.println("Transactions");

                for (int j = 0; j < branch.getCustomers().get(i).getTransaction().size(); j++) {
                    System.out.println("[" + (j + 1) + "] Amount " + branch.getCustomers().get(i).getTransaction().get(j));

                }
            }
            return true;
        } else  if (!printTransaction) {
            for (int i = 0; i < branch.getCustomers().size(); i++) {
                System.out.println("Customer " + branch.getCustomers().get(i).getName() + "[" + (i + 1) + "] ");
            }
            return true;
        }
        return false;
    }
}






















