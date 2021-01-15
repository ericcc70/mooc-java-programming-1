
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;


public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }

            list.add(input);
        }
        int answer = Collections.min(list);
        for(int i=0;i<list.size();i++){
            if(list.get(i)==answer){
                System.out.println("Smallest number: "+list.get(i));
                System.out.println("Found at index: "+i);

            }
        }

        
    }
}
