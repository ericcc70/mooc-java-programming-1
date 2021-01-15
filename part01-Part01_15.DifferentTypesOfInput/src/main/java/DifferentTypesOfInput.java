
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String hello = scan.next();
        System.out.println("Give an integer:");
        Integer hello2 = Integer.valueOf(scan.next());
        System.out.println("Give a double:");
        double hello3 = Double.valueOf(scan.next());
        System.out.println("Give a boolean:");
        boolean value = Boolean.valueOf(scan.next());
        System.out.println("You gave the string "+hello);
        System.out.println("You gave the integer "+hello2);
        System.out.println("You gave the double "+hello3);
        System.out.println("You gave the boolean "+value);

    }
}
