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
import java.util.Random; 
public class JokeManager {
    private ArrayList<String> list;
    public JokeManager(){
        this.list = new ArrayList<>();
    }
    public void addJoke(String joke){
        list.add(joke);
    }
    public String drawJoke() {
        if(list.size()==0){
            return "Jokes are in short supply.";
        }
        Random rand = new Random(); 
        return list.get(rand.nextInt(list.size()));
    }
    public void printJokes(){
        for(int i = 0; i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
