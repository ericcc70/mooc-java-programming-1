
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ones = 0;
        int two = 0;
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
            if (number>0){
                ones = ones+number;
                two = two+1;
            }


        }
        if (two!=0){
            double average = (double) ones/two;
            System.out.println("Average of the numbers: "+average);

        }
        System.out.println("Cannot calculate the average");

    }
}
