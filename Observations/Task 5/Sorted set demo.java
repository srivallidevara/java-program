import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {
    public static void main(String[] args) {

        SortedSet<Integer> parkingSlots = new TreeSet<>();

        parkingSlots.add(25);
        parkingSlots.add(10);
        parkingSlots.add(40);
        parkingSlots.add(15);
        parkingSlots.add(30);

        System.out.println("Parking Slots: " + parkingSlots);

        System.out.println("First Slot: "
                + parkingSlots.first());

        System.out.println("Last Slot: "
                + parkingSlots.last());

        System.out.println("Total Slots: "
                + parkingSlots.size());
    }
}