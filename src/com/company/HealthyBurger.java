package com.company;

public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name;
    private String healthyExtra2Name;
    private double healthyExtra1Price;
    private double healthyExtra2Price;

    public HealthyBurger( String meat,double price) {
        super(null, price, meat, null);
    }

    public double getHealthyExtra1Price() {
        return healthyExtra1Price;
    }

    public double getHealthyExtra2Price() {
        return healthyExtra2Price;
    }

    public void addHealthyAddition1(String name, double price){
        this.healthyExtra1Name=name;
        this.healthyExtra1Price=price;
        System.out.println("The add on is "+this.healthyExtra1Name+ " and the price is " +this.healthyExtra1Price);
    }
    public void addHealthyAddition2(String name, double price){
        this.healthyExtra2Name=name;
        this.healthyExtra2Price=price;
        System.out.println("The add on is "+this.healthyExtra2Name+ " and the price is " +this.healthyExtra2Price);

    }

    @Override
    public double itemizehamburger() {


        return (this.healthyExtra1Price+this.healthyExtra2Price+super.itemizehamburger());
    }
}
