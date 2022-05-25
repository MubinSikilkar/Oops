package com.company;

public class DeluxeBurger extends  Hamburger{

    private boolean chips;
    private  boolean drinks;

    public DeluxeBurger() {
        super("Deluxe Burger", 19.10,null,null);
        this.chips = true;
        this.drinks = true;

    }

    @Override
    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        System.out.println("No additional items here");
    }

    @Override
    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        System.out.println("No additional items here");
    }

    @Override
    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
        System.out.println("No additional items here");
    }

    @Override
    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
        System.out.println("No additional items here");
    }

    @Override
    public double itemizehamburger() {
        return super.itemizehamburger() +super.getPrice();
    }
}
