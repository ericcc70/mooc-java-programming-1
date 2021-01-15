
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        int counter = 0;
        ArrayList<Integer> numbers = new ArrayList<>();
        int hello = Integer.valueOf(scanner.next());
        while(hello!=-1){
            if(hello>=0&&hello<=100){
                numbers.add(hello);
            }
            
            hello = Integer.valueOf(scanner.next());
        }
        double total =0;
        for(int i = 0;i<numbers.size();i++){
            total+=numbers.get(i);
        }
        double passing = 0;
        for(int j=0;j<numbers.size();j++){
            if(numbers.get(j)>=50){
                passing+=numbers.get(j);
                counter+=1;
            }
        }
        System.out.println("Point average (all): "+total/numbers.size());
        if(passing == 0){
            System.out.println("Point average (passing): -");
            System.out.println("Pass percentage: 0.0");

        } else{
            System.out.println("Point average (passing): "+passing/counter);
            System.out.println("Pass percentage: "+100.0*counter/numbers.size());

        }
        System.out.println("Grade distribution:");
        System.out.print("5: ");
        for(int i=0;i<numbers.size();i++){
            if(numbers.get(i)>=90){
                System.out.print("*");
            }
        }
        System.out.println();
        System.out.print("4: ");
        for(int i=0;i<numbers.size();i++){
            if(numbers.get(i)<90 && numbers.get(i)>=80){
                System.out.print("*");
            }
        }
        System.out.println();

        System.out.print("3: ");
        for(int i=0;i<numbers.size();i++){
            if(numbers.get(i)<80 && numbers.get(i)>=70){
                System.out.print("*");
            }
        }
        System.out.println();

        System.out.print("2: ");
        for(int i=0;i<numbers.size();i++){
            if(numbers.get(i)<70 && numbers.get(i)>=60){
                System.out.print("*");
            }
        }
        System.out.println();

        System.out.print("1: ");
        for(int i=0;i<numbers.size();i++){
            if(numbers.get(i)<60 && numbers.get(i)>=50){
                System.out.print("*");
            }
        }
        System.out.println();

        System.out.print("0: ");
        for(int i=0;i<numbers.size();i++){
            if(numbers.get(i)<50){
                System.out.print("*");
            }
        }
    }
}
