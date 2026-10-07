import java.util.ArrayList;

public class CollectionExample {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        // Adding elements
        students.add("Anu");
        students.add("Ravi");
        students.add("Priya");
        students.add("Kiran");

        // Display collection
        System.out.println("Students List: " + students);

        // Accessing an element
        System.out.println("First Student: " + students.get(0));

        // Removing an element
        students.remove("Ravi");

        // Display after removal
        System.out.println("After Removal: " + students);

        // Size of collection
        System.out.println("Total Students: " + students.size());
    }
}