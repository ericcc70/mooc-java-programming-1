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

public class TextUI {

    private SimpleDictionary dictionary;
    private Scanner scanner;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.dictionary = dictionary;
        this.scanner = scanner;
    }

    public void start() {
        System.out.println("Command:");
        String hello = scanner.next();
        String word;
        String search;
        String translation;
        while (true) {
            if (hello.equals("end")) {
                break;
            }
            if (hello.equals("add")) {
                System.out.println("Word:");
                word = scanner.next();
                System.out.println("Translation:");
                translation = scanner.next();
                dictionary.add(word, translation);
                System.out.println("Command:");
                hello = scanner.next();
                continue;
            }
            if (hello.equals("search")) {
                System.out.println("To be translated:");
                search = scanner.next();
                if (dictionary.translate(search)==null) {
                    System.out.println("Word " + search + " was not found");
                } else {
                    System.out.println(dictionary.translate(search));

                }
                System.out.println("Command:");
                hello = scanner.next();
                continue;
            }
            System.out.println("Unknown command");
            System.out.println("Command:");
            hello = scanner.next();

        }
        System.out.println("Bye bye!");

    }
}
