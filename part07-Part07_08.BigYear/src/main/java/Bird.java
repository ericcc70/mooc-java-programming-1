
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ericjiang
 */
public class Bird {

    private String name;
    private String latin;
    private int seen;

    public Bird(String name, String latin) {
        this.name = name;
        this.latin = latin;
        this.seen = 0;
    }

    public String getName() {
        return this.name;
    }
    public String getLatin() {
        return this.latin;
    }
    public void activate(){
        this.seen+=1;
    }

    public int getSeen() {
        return this.seen;
    }
}
