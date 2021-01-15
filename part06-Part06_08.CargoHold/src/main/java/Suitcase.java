/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ericjiang
 */
import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Item> items;
    private int maxWeight;
    private int counter;

    public Suitcase(int weight) {
        this.maxWeight = weight;
        this.items = new ArrayList();
        this.counter = 0;
    }

    public void addItem(Item item) {
        this.counter += item.getWeight();
        if (counter <= maxWeight) {
            items.add(item);
        } else {
            this.counter -= item.getWeight();
        }

    }

    public String toString() {
        if (items.size() == 0) {
            return "no items (0 kg)";
        }
        if (items.size() == 1) {
            return items.size() + " item (" + counter + " kg)";

        }
        return items.size() + " items (" + counter + " kg)";
    }

    public void printItems() {
        for(int i = 0; i<items.size();i++){
            System.out.println(items.get(i));
        }
    }
    public int totalWeight(){
        return counter;
    }
    public Item heaviestItem(){
        if(items.size()==0){
            return null;
        }
        Item returnObject = items.get(0);
        for(Item each:items){
            if(returnObject.getWeight()<each.getWeight()){
                returnObject = each;
            }
        }
        return returnObject;
    }
}
