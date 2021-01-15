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

public class Package {
    private ArrayList<Gift> list;
    public Package(){
        this.list = new ArrayList();
    }
    public void addGift(Gift gift){
        list.add(gift);
    }
    public int totalWeight(){
        int counter =0;
        for(int i=0;i<list.size();i++){
            counter+=list.get(i).getWeight();
        }
        return counter;
    }
    
}
