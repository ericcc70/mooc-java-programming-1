
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        if (this.elements.size() == 0) {
            return "The collection " + name + " is empty.";
        }
        String alphabet = "";
        int counter = 0;

        for (String person : elements) {
            counter += 1;
            alphabet = alphabet + person + "\n";
        }
        if (counter > 1) {
            return "The collection " + name + " has " + counter + " elements:\n" + alphabet;

        }
        alphabet = alphabet.replace("\n","");
        return "The collection " + name + " has " + counter + " element:\n" + alphabet;
    }

}
