// Parent Class
class FoodItem {
    protected double price;
    protected String name;

    public FoodItem() {
        System.out.println("FoodItem Default Constructor called.");
    }

    public FoodItem(double price, String name) {
        this.price = price;
        this.name = name;
        System.out.println("FoodItem Parameterized Constructor called.");
    }

    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
    }
}

// Subclass Pizza
class Pizza extends FoodItem {
    private String size;

    public Pizza(String size, double price, String name) {
        super(price, name);
        this.size = size;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Size: " + size);
        System.out.println("-------------------------");
    }
}

// Subclass Burger
class Burger extends FoodItem {
    private int numberOfPatties;

    public Burger(int numberOfPatties, double price, String name) {
        super(price, name);
        this.numberOfPatties = numberOfPatties;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Number of Patties: " + numberOfPatties);
        System.out.println("-------------------------");
    }
}

// Main class to run the program
public class Main {
    public static void main(String[] args) {
        // Creating objects
        Pizza myPizza = new Pizza("Large", 15.99, "Pepperoni Feast");
        Burger myBurger = new Burger(2, 8.50, "Double Cheese Delight");

        // Displaying details
        System.out.println("\n--- Order Details ---");
        myPizza.showDetails();
        myBurger.showDetails();
    }
}