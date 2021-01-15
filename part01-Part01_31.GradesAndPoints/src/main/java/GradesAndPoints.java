
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give points [0-100]:");
        int first = Integer.valueOf(scan.nextLine());
        if (first<0){
            System.out.println("impossible!");
   
        } else if(first<=49){
            System.out.println("failed");

        } else if(first<=59){
            System.out.println(1);

        } else if (first<=69){
            System.out.println(2);

        } else if (first <= 79){
            System.out.println(3);

        } else if (first<=89){
            System.out.println(4);

        } else if (first<= 100){
            System.out.println(5);

        } else if (first >100){
            System.out.println("incredible!");

        }
    }
}
