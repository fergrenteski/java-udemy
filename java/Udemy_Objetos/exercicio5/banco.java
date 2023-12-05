/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Udemy_Objetos.exercicio5;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author luiz.grenteski
 */
public class banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;
        
        System.out.printf("Enter account number: ");
        int number = sc.nextInt();
        
        System.out.printf("Enter account holder: ");
        sc.nextLine();
        String name = sc.nextLine();
        
        System.out.printf("Is there na Initial deposit? (y/n) ");
        char option = sc.next().charAt(0);
        if (option == 'y'){
            System.out.printf("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(name, number, initialDeposit);
        } 
        else {
            account = new Account(name, number);
        }
        
        System.out.println();
        System.out.println("Account data:");
        System.out.println(account.toString());
        
        System.out.println();
        System.out.printf("Enter a deposit value: ");
        double value = sc.nextDouble();
        account.deposit(value);
        System.out.println("Updated Account data:");
        System.out.println(account.toString());
        
        System.out.println();
        System.out.printf("Enter a withdraw value: ");
        value = sc.nextDouble();
        account.withdraw(value);
        System.out.println("Updated Account data:");
        System.out.println(account.toString());
        
        sc.close();
    }
}
