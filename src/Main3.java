import com.company.DeluxeBurger;
import com.company.Hamburger;
import com.company.HealthyBurger;

public class Main3 {
    public static void main(String[] args) {
//        Hamburger hamburger= new Hamburger("Basic Meat Burger", "Goat meat","Brown roll",50);
 //       hamburger.addHamburgerAddition1("Lettuce",10);
 //       hamburger.addHamburgerAddition3("Cheese",20);
   //     hamburger.itemizehamburger();
 //       DeluxeBurger deluxeBurger= new DeluxeBurger();
   //     deluxeBurger.addHamburgerAddition1("Lettuce",10);
     //   deluxeBurger.itemizehamburger();
        HealthyBurger healthyBurger= new HealthyBurger("Goat",80);
        healthyBurger.addHealthyAddition1("Sausage",10.2);
        healthyBurger.addHealthyAddition2("Cheese",9.2);

        System.out.println(healthyBurger.itemizehamburger());
    }
}
