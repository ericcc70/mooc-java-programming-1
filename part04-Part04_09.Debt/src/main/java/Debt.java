/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ericjiang
 */
public class Debt {
    private double initialBalance;
    private double initialInterestRate;
    public Debt(double initialBalance, double initialInterestRate){
        this.initialBalance = initialBalance;
        this.initialInterestRate = initialInterestRate;
    }
    public void printBalance(){
        System.out.println(this.initialBalance);
    }
    public void waitOneYear(){
        this.initialBalance = this.initialBalance*this.initialInterestRate;
    }
}
