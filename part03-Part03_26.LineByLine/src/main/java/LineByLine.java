
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String answer = scanner.nextLine();
            if (answer.length() == 0) {
                break;
            }
            String[] correct = answer.split(" ");
            for (int i = 0; i < correct.length; i++) {
                System.out.println(correct[i]);
            }
        }

    }
}
