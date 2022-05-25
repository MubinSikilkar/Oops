package com.company;

public class Player_1 {
    public String name;
    public int health;
    public String weapon;

    public void looseHealth(int damage){
        this.health-=damage;
        if(this.health<=0){
            System.out.println(name+ " is finished ");
        }else {
            System.out.println("The player "+name+ " has taken damage " +damage+ " and his remaining health is " +this.health);
        }
    }

    public int remainingHealth(){
        return this.health;
    }


}
