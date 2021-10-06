package challenge;


public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);
        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon",5.99);
        healthyBurger.addHealthAddition1("Egg",0.50);
        healthyBurger.addHealthAddition2("Coke",1.24);

        System.out.println("Total:"+healthyBurger.itemizeHamburger());


        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition3("cookies",1.11);
        System.out.println(db.itemizeHamburger());
    }
}
