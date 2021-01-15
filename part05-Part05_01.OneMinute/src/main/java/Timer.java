/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ericjiang
 */
public class Timer {

    private int hundred;
    private int second;

    public Timer() {
        this.hundred = 0;
        this.second = 0;
    }

    public void advance() {
        this.hundred = this.hundred + 1;

        if (this.hundred == 100) {
            this.hundred = 0;
            this.second += 1;
        }
        if (this.second == 60) {
            this.second = 0;
        }
    }

    public String toString() {
        if (this.second < 10 && this.hundred<10) {
            return "0" + this.second+ ":" + "0"+hundred;
        }
        if(this.second<10){
            return "0" + this.second+ ":" +hundred;
        }
        if (this.hundred<10){
            return this.second+ ":" + "0"+hundred;
        }
        return this.second+ ":" +hundred;
    }
}
