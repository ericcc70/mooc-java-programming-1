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

public class Stack {

    private ArrayList<String> stack;
    public Stack() {
        this.stack = new ArrayList<>();
    }
    public boolean isEmpty(){
        if(stack.size()==0){
            return true;
        }
        return false;
    }
    public void add(String value){
        stack.add(0, value);
    }
    public ArrayList<String> values(){
        return stack;
    }
    public String take() {
        String hello = stack.get(0);
        stack.remove(0);
        return hello;
    }
}
