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
public class Room {
    private ArrayList<Person> list;
    public Room(){
        this.list = new ArrayList();
    }
    public void add(Person person){
        list.add(person);
    }
    public boolean isEmpty(){
        if(list.size()==0){
            return true;
        }
        return false;
    }
    public ArrayList<Person> getPersons(){
        return list;
    }
    public Person shortest(){
        if(list.isEmpty()){
            return null;
        }
        Person returnObject = list.get(0);
        for(Person each: list){
            if(each.getHeight()<returnObject.getHeight()){
                returnObject = each;
            }
        }
        return returnObject;
    }
    public Person take(){
        Person answer = shortest();
        list.remove(answer);
        return answer;
    }
}
