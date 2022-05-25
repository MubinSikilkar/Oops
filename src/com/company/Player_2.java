package com.company;

public class Player_2 {
    private String name;
    private String weapon;
    private int health;

    public Player_2(String name, String weapon, int health) {
        this.name = name;
        this.weapon = weapon;
        if(health>0 && health<=100)
        this.health = health;
        else{
            System.out.println("Invalid health");
        }
    }

    public void looseHealth(int damage){
        this.health-=damage;
        if (health<=0){
            System.out.println( name+ " is finished");
        }else{
            System.out.println(name+ " has received damage " +damage+ " and remaining health is "+this.health);
        }
    }

    public void restoreHealth(int restore){
        this.health+= restore;
        if (health<=0)
            System.out.println("Player is knocked out");
        else
        System.out.println("Health after medkit is " +this.health);
    }

}
