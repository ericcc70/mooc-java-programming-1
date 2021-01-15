
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        String name ="";
        while(true){
            String answer = scanner.nextLine();
            if(answer.equals("")){
                break;
            }
            String []hello = answer.split(",");
            if(sum<Integer.valueOf(hello[1])){
                sum = Integer.valueOf(hello[1]);
                name = hello[0];
            }
        }
        System.out.println("Name of the oldest: "+name);

    }
}
