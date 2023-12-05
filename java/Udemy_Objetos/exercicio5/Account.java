/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Udemy_Objetos.exercicio5;

/**
 *
 * @author luiz.grenteski
 */

public class Account {
    private String name;
    private int number;
    private double balance;
    private final double TAX = 5.00;

    public Account(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public Account(String name, int number, double balance) {
        this.name = name;
        this.number = number;
        this.balance = balance;
    } 
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public double deposit(double amount){
        return this.balance -= amount;
    }
    
    public double withdraw(double amount){
        return this.balance -= amount - TAX;
    }
    
    public String toString(){
        return "Account " + number + ", Holder: " + name + ", Balance: $" + balance;
    }
}



