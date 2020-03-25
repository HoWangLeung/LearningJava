package academy.learnProgramming;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);
//        System.out.println("Total Burge price is " + hamburger.itemizeHamburger());
        price = hamburger.itemizeHamburger();
        System.out.println(price);

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddition1("Egg", 5.43);
        healthyBurger.addHealthAddition1("Lentils",3.41);
        System.out.println("Total Healthy Burger price is " + healthyBurger.itemizeHamburger());

        DeluxeBurgar db = new DeluxeBurgar();
        db.addHamburgerAddition1("should not add" , 1);
        db.itemizeHamburger();

    }
}
