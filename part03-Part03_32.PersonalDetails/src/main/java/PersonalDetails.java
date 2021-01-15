
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int add = 0;
        double divide =0;
        String name ="";
        while(true){
            String answer = scanner.nextLine();
            if(answer.equals("")){
                break;
            }
            String []hello = answer.split(",");
            if(sum<hello[0].length()){
                sum = hello[0].length();
                name = hello[0];
            }
            add+=Integer.valueOf(hello[1]);
            divide +=1;
        }
        System.out.println("Longest name: "+name);
        System.out.println("Average of the birth years: "+(add/divide));



    }
}
