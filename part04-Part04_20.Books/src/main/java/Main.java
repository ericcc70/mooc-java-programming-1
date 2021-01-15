
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Title:");
            String firstname = scanner.nextLine();
            if (firstname.isEmpty()) {
                break;
            }

            System.out.println("Pages:");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.println("Publication Year");
            String publicationYear = scanner.nextLine();

            // We add a new person to the list.
            // The person's name and age were decided by the user
            books.add(new Book(firstname, pages, publicationYear));
        }
        System.out.println("What information will be printed?");
        String info = scanner.nextLine();
        if(info.equals("everything")){
            for(Book everything: books){
                System.out.println(everything);
            }
        }
        if(info.equals("name")){
            for(Book everything: books){
                System.out.println(everything.getName());
            }
        }

    }
}
