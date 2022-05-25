package com.company;

public class Animal {
    private int brain;
    private int body;
    private int size;
    private String name;
    public void eat(){
        System.out.println("animal.eat() called");

    }
    public void move(){
        System.out.println("Animal.move() called");
    }

    public Animal(int brain, int body, int size, String name) {
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.name = name;
    }
}