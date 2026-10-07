import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

        List<String> places = new ArrayList<>();

        places.add("Kerala");
        places.add("Goa");
        places.add("Ooty");
        places.add("Jaipur");

        System.out.println("My Travel List: " + places);

        // Accessing an element
        System.out.println("First Place: " + places.get(0));

        // Removing an element
        places.remove("Goa");

        System.out.println("After Removal: " + places);

        // Size of List
        System.out.println("Total Places: " + places.size());
    }
}