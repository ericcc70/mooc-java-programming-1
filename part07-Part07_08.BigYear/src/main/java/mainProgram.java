
import java.util.Scanner;
import java.util.ArrayList;


public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        System.out.println("?");
        String hello = scan.next();
        ArrayList<Bird> birds = new ArrayList();
        while(!hello.equals("Quit")){
            if(hello.equals("Add")){
                System.out.println("Name:");
                String name = scan.next();
                System.out.println("Name in Latin:");
                String latin = scan.next();
                birds.add(new Bird(name, latin));
            }
            if(hello.equals("Observation")){
                System.out.println("Bird?");
                String thebird = scan.next();
                String answer = "Not a bird!";
                for(int i = 0;i<birds.size();i++){
                    if(birds.get(i).getName().equals(thebird)){
                        birds.get(i).activate();
                        answer = "exists";
                    }
                }
                if(answer.equals("Not a bird!")){
                    System.out.println(answer);
                }
            }
            if(hello.equals("All")){
                for(int i = 0;i<birds.size();i++){
                    System.out.println(birds.get(i).getName()+" ("+birds.get(i).getLatin()+"): "+birds.get(i).getSeen()+" observations");
                }
            }
            if(hello.equals("One")){
                System.out.println("Bird?");
                String dabird = scan.next();
                for(int i = 0;i<birds.size();i++){
                    if(birds.get(i).getName().equals(dabird)){
                         System.out.println(birds.get(i).getName()+" ("+birds.get(i).getLatin()+"): "+birds.get(i).getSeen()+" observations");
                    }
                }
            }
            System.out.println("?");
            hello = scan.next();
        }
    }

}
