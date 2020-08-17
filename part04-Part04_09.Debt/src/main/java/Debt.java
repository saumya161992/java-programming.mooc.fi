/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saumya Nagia
 */
public class Debt {
    
    private double interestRate;
    private double balance;
    
    public Debt(double initialBalance, double initialInterestRate){
        
        this.interestRate = initialInterestRate;
        this.balance = initialBalance; 
        
    }
    
    public void printBalance(){
    
        System.out.println(this.balance);
    
    }
    
    public void waitOneYear(){
        double debt = 0.0;
        debt = debt + this.balance * this.interestRate;
        this.balance = debt;
        //System.out.println(debt);
    }
}
