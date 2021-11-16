package OOP_Challenge;

public class HealthyBurger extends Hamburger{

    private String HealthyAddition1name;
    private double HealthyAddition1price;

    private String HealthyAddition2name;
    private double HealthyAddition2price;


    public HealthyBurger( String meat, double price) {
        super("Healthy", meat, price, "Brown Rye");
    }

    public void addHealthAddition1(String name, double price) {
        this.HealthyAddition1price = price;
        this.HealthyAddition1name = name;
    }

    public void addHealthAddition2(String name, double price) {
        this.HealthyAddition2price = price;
        this.HealthyAddition2name = name;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();
        if(this.HealthyAddition1name!=null)
        {
            hamburgerPrice+=this.HealthyAddition1price;
            System.out.println("Added "+ this.HealthyAddition1name+",Price:"+this.HealthyAddition1price);
        }

        if(this.HealthyAddition2name!=null)
        {
            hamburgerPrice+=this.HealthyAddition2price;
            System.out.println("Added "+ this.HealthyAddition2name+",Price:"+this.HealthyAddition2price);
        }

        return hamburgerPrice;
    }
}
