
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username:");
        String response1 = scanner.nextLine();
        System.out.println("Enter password:");
        String response2 = scanner.nextLine();
        if((response1.equals("alex") && response2.equals("sunshine")) | (response1.equals("emma")&& response2.equals("haskell"))){
            System.out.println("You have successfully logged in!");
        } else{
            System.out.println("Incorrect username or password!");
        }

    }
}
