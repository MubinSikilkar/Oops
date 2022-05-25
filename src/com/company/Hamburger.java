package com.company;

public class Hamburger {
    private String name;
    private String meat;
    private String breadRollType;
    private double price;
    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, double price,String meat,String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;

    }

    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        this.addition1Name = addition1Name;

        this.addition1Price = addition1Price;
    }

    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        this.addition2Name = addition2Name;
        this.addition2Price=addition2Price;

    }

    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
        this.addition3Name = addition3Name;
        this.addition3Price=addition3Price;

    }

    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
        this.addition4Name = addition4Name;
        this.addition4Price=addition4Price;

    }

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public double getPrice() {
        return price;
    }

    public double getAddition1Price() {
        return addition1Price;
    }

    public double getAddition2Price() {
        return addition2Price;
    }

    public double getAddition3Price() {
        return addition3Price;
    }

    public double getAddition4Price() {
        return addition4Price;
    }

    public String getAddition1Name() {
        return addition1Name;
    }

    public String getAddition2Name() {
        return addition2Name;
    }

    public String getAddition3Name() {
        return addition3Name;
    }

    public String getAddition4Name() {
        return addition4Name;
    }

    public double itemizehamburger() {
        double totalSum =  getPrice() +getAddition1Price()+getAddition2Price()+getAddition3Price()+getAddition4Price();
        System.out.println("The base price of the hamburger is " + getPrice() + "\n"
                + "The addition1 in the hamburger is " +getAddition1Name() + " priced " +getAddition1Price() +"\n"
                + "The addition2 in the hamburger is " +getAddition2Name() + " priced " +getAddition2Price() +"\n"
                + "The addition3 in the hamburger is " +getAddition3Name() + " priced " +getAddition3Price() +"\n"
                + "The addition4 in the hamburger is " +getAddition4Name() + " priced " +getAddition4Price() +"\n"
                + "The total price of the hamburger is " + totalSum);
        return totalSum;

    }


}

