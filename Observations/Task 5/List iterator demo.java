import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {

        List<String> songs = new ArrayList<>();

        songs.add("Kesariya");
        songs.add("Samajavaragamana");
        songs.add("Inkem Inkem");
        songs.add("Butta Bomma");

        ListIterator<String> it = songs.listIterator();

        System.out.println("Songs in Forward Direction:");

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("\nSongs in Reverse Direction:");

        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }
    }
}