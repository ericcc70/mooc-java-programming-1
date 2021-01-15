
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ones = 0;

// The task is to read an input from the user
        while (true) {
            System.out.println("Give a number:");
            // The task is to read a user inputted number
            int number = Integer.valueOf(scanner.nextLine());

            // The task is to exit the loop if the user
            // has inputted zero
            if (number == 0) {
                break;
            }
            ones = ones+number;


        }
        System.out.println("Sum of the numbers: "+ones);

    }
}
