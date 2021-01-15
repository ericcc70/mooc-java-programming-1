import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {

        ArrayList<String> recipes = new ArrayList<>(); // ALL recipes in recipe.txt
        ArrayList<Recipe> recipesO = new ArrayList<>(); // recipes splitted & grouped in objects
        ArrayList<Integer> indices = new ArrayList<>(); // cooking times in all recipes list 
        List<String> ingr; // ingredients separated by recipe

        // create recipes - all lines together
        Scanner user = new Scanner(System.in);
        try (Scanner scanner = new Scanner(Paths.get(user.next()))) {
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                if (row.isEmpty()) {
                    continue;
                }
                recipes.add(row);
            }
        }
        catch (Exception e) {
            System.out.println("An error occured..");
        }

        // find cooking times (integers) in file
        for (String r: recipes) {
            if (isInteger(r)) {
                indices.add(recipes.indexOf(r));
            }
        }

        // split and group recipes
        for (int i = 0; i < indices.size() - 1; i++) {

            int time = Integer.valueOf(recipes.get(indices.get(i)));
            String name = recipes.get(indices.get(i) - 1);

            recipesO.add(new Recipe(name, time, recipes.subList(indices.get(i) + 1, indices.get(i + 1) - 1)));
        }

        int j = indices.size() - 1;
        int time = Integer.valueOf(recipes.get(indices.get(j)));
        String name = recipes.get(indices.get(j) - 1);

        recipesO.add(new Recipe(name, time, recipes.subList(indices.get(j) + 1, recipes.size())));

        /* for (Recipe r: recipesO) {
            System.out.println(r);
            System.out.println(r.getIngr());
            
        } */

        System.out.println("File to read: recipes.txt");
        System.out.println("");
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println("");

        // accept command from user and execute command
        
        while (true) {
            System.out.print("Enter command: ");
            String command = user.nextLine();

            // command "stop" implementation 
            if (command.equals("stop")) {
                break;
            }

            // command "list" implementation
            if (command.equals("list")) {
                System.out.println("");
                System.out.println("Recipes:");
                for (Recipe r: recipesO) {
                    System.out.println(r);
                }
                System.out.println("");
            }
            // command "find name" implementation
            if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String search = user.nextLine();
                System.out.println("");
                System.out.println("Recipes:");
                for (Recipe r: recipesO) {
                    if (r.getName().contains(search)) {
                        System.out.println(r);
                    }
                }
                System.out.println("");
            }

            // command "find cooking time" implementation
            if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int maxTime = Integer.valueOf(user.nextLine());
                System.out.println("");
                System.out.println("Recipes:");
                for (Recipe r: recipesO) {
                    if (r.getTime() <= maxTime) {
                        System.out.println(r);
                    }
                }
                System.out.println("");
            }

            // command "find ingredient" implementation
            if (command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String ingredient = user.nextLine();
                System.out.println("");
                System.out.println("Recipes:");
                for (Recipe r: recipesO) {
                    if (r.getIngr().contains(ingredient)) {
                        System.out.println(r);
                    }
                }
                System.out.println("");
            }
        }
    }

        public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }
} 
