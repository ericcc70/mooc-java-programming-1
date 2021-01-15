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
public class Hold {
    private ArrayList<Suitcase> list;
    private int maxWeight;
    private int counter;
    public Hold(int weight){
        this.list = new ArrayList();
        this.maxWeight = weight;
        this.counter = 0;
    }
    public void addSuitcase(Suitcase suitcase){
        this.counter += suitcase.totalWeight();
        if (counter <= maxWeight) {
            list.add(suitcase);
        } else {
            this.counter -= suitcase.totalWeight();
        }
    }
    public String toString(){
        return list.size() + " suitcases (" + counter + " kg)";
    }
    public void printItems(){
        for(int i = 0; i<list.size();i++){
            list.get(i).printItems();
        }
    }
}
