
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("First Name");
            String firstname = scanner.nextLine();
            if (firstname.isEmpty()) {
                break;
            }

            System.out.println("Last Name");
            String lastname = scanner.nextLine();
            System.out.println("Identification number:");
            String id = scanner.nextLine();

            // We add a new person to the list.
            // The person's name and age were decided by the user
            infoCollection.add(new PersonalInformation(firstname, lastname, id));
        }
        for (PersonalInformation person : infoCollection) {
            System.out.print(person.getFirstName());
            System.out.print(" ");
            System.out.print(person.getLastName());
            System.out.println();

        }

    }
}
