public class Person {
    private String firstName;
    private String lastName;
    private int age;
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }

    public String getFirstName(){return this.firstName;}
    public void setLastName(String lastName){
        this.lastName=lastName;
    }

    public String getLastName(){return this.lastName;}
    public void setAge(int age){
        if((age<0) || (age>100)){
            this.age=0;
        }else {
            this.age=age;
        }
    }

    public int getAge(){return this.age;}

    public String isTeen(){
        if((age>12) && (age<20)){
            return "teen";
        }else{
            return "not teen";
        }
    }

    public String getFullName() {
        if ((firstName == " ") && (lastName == " ")) {
            return " ";
        } else if (lastName == " ") {
            return firstName;
        } else if (firstName == " ") {
            return lastName;

        } else {
            return firstName + " " +lastName;

        }


    }
    public boolean isEmpty(){
        if(firstName== ""){
            return firstName.isEmpty();
        }

        return false;
    }
}
