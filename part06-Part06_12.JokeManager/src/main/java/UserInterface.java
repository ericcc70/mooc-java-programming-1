/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ericjiang
 */
import java.util.Scanner;

public class UserInterface {

    private JokeManager jm;
    private Scanner scanner;

    public UserInterface(JokeManager jm, Scanner scanner) {
        this.jm = jm;
        this.scanner = scanner;
    }

    public void start() {

        while (true) {
            System.out.println("Commands:");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");
            String command = scanner.nextLine();
            if (command.equals("1")) {
                System.out.println("Write the joke to be added:");
                jm.addJoke(scanner.nextLine());
            }
            if (command.equals("2")) {
                System.out.println(jm.drawJoke());
            }
            if (command.equals("3")) {
                System.out.println("Printing the jokes.");
                jm.printJokes();
            }
            if (command.equals("X")) {
                break;
            }
        }

    }
}
