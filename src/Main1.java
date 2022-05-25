class Car1 {
    private boolean engine;
    private int cylinders;
    private int wheel;
    private int airbags;
    private int carCapacity;
    private String name;

    public Car1( int cylinders,String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.wheel = 4;
        this.name = name;
    }


    public int getCylinders() {
        return cylinders;
    }


    public int getAirbags() {
        return airbags;
    }

    public int getCarCapacity() {
        return carCapacity;
    }

    public String getName() {
        return name;
    }

    public String startEngine(){
        return "The engine is started and gears are set to 1 in automatic mode";

    }
    public String applyBrakes(){
       return "The car is slowed down";
    }
    public String accelerate(){
        return "The car is being accelerated";
    }

}

class Lamborghini extends Car1{
    private String color;
    private int airBags;
    private int seatingCapacity;
    private String carType;

    public Lamborghini(int cylinders, String name, String color, int airBags, int seatingCapacity, String carType) {
        super(cylinders, name);
        this.color = color;
        this.airBags = airBags;
        this.seatingCapacity = seatingCapacity;
        this.carType=carType;
    }

    @Override
    public String startEngine() {
        return "Engine of Lamborghini is on";
    }

    @Override
    public String applyBrakes() {
        return "The disc brakes of Lamborghini are best in the world ";
    }

    @Override
    public String accelerate() {
        return "Lamborghini accelerates from 0-100 in 3 seconds ";
    }
}

class RollsRoyce extends Car1{
    private String color;
    private int airBags;
    private int seatingCapacity;
    private String carType;

    public RollsRoyce(int cylinders, String name, String color, int airBags, int seatingCapacity, String carType) {
        super(cylinders, name);
        this.color = color;
        this.airBags = airBags;
        this.seatingCapacity = seatingCapacity;
        this.carType= carType;
    }


    @Override
    public String startEngine() {
        return "RollsRoyce has the best engine in the world with excellent fuel efficiency ";
    }

    @Override
    public String applyBrakes() {
        return "RollsRoyce has comfortable breaks with no jerks";
    }

    @Override
    public String accelerate() {
        return "RollsRoyce can accelerate from 0 to 100 on 6 seconds";
    }
}

public class Main1{
    public static void main(String[] args) {
        Car1 car1= new Car1(4,"Indian made");
        System.out.println(car1.accelerate());
        System.out.println(car1.applyBrakes());
        System.out.println(car1.startEngine());
        System.out.println(car1.getCarCapacity());
        Lamborghini lamborghini= new Lamborghini(4,"German Made","Yellow",6,2,"Sports");
        System.out.println(lamborghini.accelerate());
        System.out.println(lamborghini.applyBrakes());
        System.out.println(lamborghini.startEngine());
        RollsRoyce rollsRoyce= new RollsRoyce(6,"UAE made","White",6,4,"Luxury");
        System.out.println(rollsRoyce.accelerate());
        System.out.println(rollsRoyce.applyBrakes());
        System.out.println(rollsRoyce.startEngine());


    }

}


