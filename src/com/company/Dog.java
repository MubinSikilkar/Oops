package com.company;

public class Dog extends Animal {
    private int eyes;
    private int tail;
    private int teeth;
    private int legs;
    private String coat;

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        super.eat();
    }

    @Override
    public void move() {
        System.out.println("Dog.move() called");
        super.move();
    }

    public Dog(int brain, int body, int size, String name, int eyes, int tail, int teeth, int legs, String coat) {
        super(brain, body, size, name);
        this.eyes=eyes;
        this.tail=tail;
        this.teeth=teeth;
        this.legs=legs;
        this.coat=coat;
        System.out.println("Dog.chew() is called");
    }
}
