
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String answer = scanner.nextLine();
            if(answer.equals("")){
                break;
            }
            String [] levi = answer.split(" ");
            System.out.println(levi[levi.length-1]);
        }

    }
}
