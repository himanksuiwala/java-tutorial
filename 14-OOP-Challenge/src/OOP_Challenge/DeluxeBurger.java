package OOP_Challenge;

public class DeluxeBurger extends Hamburger{
    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Sorry");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Sorry");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Sorry");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Sorry");
    }

    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon", 14.55, "White");
        super.addHamburgerAddition1("Chips",1.85);
        super.addHamburgerAddition2("Coke",1.11);

    }
}
