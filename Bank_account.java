package com.company;

public class Bank_account {
    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;
    public Bank_account() {
        this("56789",2.50,"Default name","Default address","default phone");
        System.out.println("Empty constructor called");
    }
    public Bank_account(String accountNumber,double accountBalance,String customerName,String email,String phoneNumber) {
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Bank_account(String customerName, String email, String phoneNumber) {
        this("99999",100.55, customerName,email,phoneNumber);
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }
    public double getAccountBalance() {
        return this.accountBalance;
    }
    public String getCustomerName() {
        return this.customerName;
    }
    public String getEmail() {
        return this.email;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber=accountNumber;
    }
    public void setAccountBalance(double accountBalance) {
        this.accountBalance  = accountBalance;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void depositFunds(double funds) {
        this.accountBalance += funds;
        System.out.println("Deposit of "+funds+ " made.New balance is "+this.accountBalance);
    }
    public void withdrawFunds(double withdraw) {
        if(this.accountBalance-withdraw <= 0) {
            System.out.println("Only "+this.accountBalance +" available. Withdrawal not processed");
        }else {
            accountBalance -=withdraw;
            System.out.println("Withdrawal of " + withdraw+ " processed. Remaining balance = "+accountBalance);
        }
    }
}