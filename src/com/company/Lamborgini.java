package com.company;

public class Lamborgini extends Car {
    private int roadService;

    public Lamborgini(  int roadService) {
        super("Lamborgini", "2WD", 4, 2, 6, false);
        this.roadService = roadService;
    }
        public void accelerate(int rate){
            int newVelocity= getCurrentVelocity()+rate;
            if(newVelocity ==0){
                stop();
                changeGear(1);
            } else if (newVelocity>0 && newVelocity<=10) {
                changeGear(1);
            } else if (newVelocity>10 && newVelocity<=30) {
                changeGear(2);

            } else if (newVelocity>30 && newVelocity<=80) {
                changeGear(3);

            } else if (newVelocity>80 && newVelocity<=100) {
                changeGear(4);

            } else if (newVelocity>100 && newVelocity<=140) {
                changeGear(5);

            }else{
                changeGear(6);
            }
            if (newVelocity>0){
                changeVelocity(newVelocity,getCurrentDirection());
            }
        }

}
