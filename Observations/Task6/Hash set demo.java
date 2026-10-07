import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {

        HashMap<String, Integer> products = new HashMap<>();

        // Adding products and prices
        products.put("Notebook", 50);
        products.put("Pen", 20);
        products.put("Bag", 800);
        products.put("Bottle", 300);

        System.out.println("Products: " + products);

        // Getting price
        System.out.println("Price of Bag: "
                + products.get("Bag"));

        // Checking product
        System.out.println("Is Pen available? "
                + products.containsKey("Pen"));

        // Removing product
        products.remove("Bottle");

        System.out.println("After Removal: " + products);
    }
}