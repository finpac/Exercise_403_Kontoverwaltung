/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author Patrick
 */
public class Account extends Thread
{
    private static double money ;

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
    
    public void output()
    {
        System.out.println("Actual money: "+money);
    }

    @Override
    public void run() {
        
    }
    
}
