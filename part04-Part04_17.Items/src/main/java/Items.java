
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a name, empty will stop: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            // Add to the list a new person
            // whose name is the previous user input
            items.add(new Item(name));
        }
        System.out.println();
        for (Item person : items) {
            System.out.println(person);
        }
    }
}
