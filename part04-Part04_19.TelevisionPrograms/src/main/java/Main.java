
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Name:");
            String firstname = scanner.nextLine();
            if (firstname.isEmpty()) {
                break;
            }

            System.out.println("Duration");
            int duration = Integer.valueOf(scanner.nextLine());

            // We add a new person to the list.
            // The person's name and age were decided by the user
            programs.add(new TelevisionProgram(firstname, duration));
        }
        System.out.println("Program's maximum duration?");
        int max = Integer.valueOf(scanner.nextLine());
        for(TelevisionProgram program: programs){
            if(program.getDuration()<=max){
                System.out.println(program);
            }
        }
    }
}
