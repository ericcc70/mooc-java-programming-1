
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int first = Integer.valueOf(scan.nextLine());
        if (first<5000){
            System.out.println("No tax!");
        } else if (first <25000){
            System.out.println("Tax: "+(100+(first-5000)*0.08));

        } else if (first<55000){
            System.out.println("Tax: "+(1700+(first-25000)*0.1));

        } else if (first<200000){
            System.out.println("Tax: "+(4700+(first-55000)*0.12));

        } else if (first<1000000){
            System.out.println("Tax: "+(22100+(first-200000)*0.15));

        } else if (first > 1000000){
            System.out.println("Tax: "+(142100+(first-1000000)*0.17));

        }
    }
}
