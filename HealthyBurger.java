package com.company;

public class HealthyBurger extends Hamburger {
    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price,"Brown rye");

    }

     private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;
public void addHealthyAddition1(String additionName ,double additionPrice ) {
    this.healthyExtra1Name = additionName;
    this.healthyExtra1Price = additionPrice;

}
    public void addHealthyAddition2(String healthyExtra2Name,double healthyExtra2Price) {
        this.healthyExtra2Name = healthyExtra2Name;
        this.healthyExtra2Price = healthyExtra2Price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice =  super.itemizeHamburger();
        if(this.healthyExtra1Name !=null) {
            hamburgerPrice+=this.healthyExtra1Price;
            System.out.println("Added "+this.healthyExtra1Name+" for an extra "+this.healthyExtra1Price);
        }if(this.healthyExtra2Name !=null) {
            hamburgerPrice+=this.healthyExtra2Price;
            System.out.println("Added "+this.healthyExtra1Name+" for an extra "+this.healthyExtra2Price);
        }
        return hamburgerPrice;
    }
}
