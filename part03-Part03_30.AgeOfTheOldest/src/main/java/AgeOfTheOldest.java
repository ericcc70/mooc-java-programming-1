
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while(true){
            String answer = scanner.nextLine();
            if(answer.equals("")){
                break;
            }
            String []hello = answer.split(",");
            if(sum<Integer.valueOf(hello[1])){
                sum = Integer.valueOf(hello[1]);
            }
        }
        System.out.println("Age of the oldest: "+sum);

    }
}
