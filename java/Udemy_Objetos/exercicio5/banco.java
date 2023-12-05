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
        
        System.out.printf("Enter account number: ");
        int number = sc.nextInt();
        
        System.out.printf("Enter account holder: ");
        sc.next();
        String name = sc.nextLine();
        
        Account account = new Account(name, number);
        
        System.out.printf("Is there na Initial deposit? (y/n) ");
        sc.next();
        String option = sc.next();
        
        if (option == "y"){
            System.out.printf("Enter initial deposit value: ");
            double value = sc.nextDouble();
            account.deposit(value);
        } else if (option != "not"){
            System.out.println("Invalid option");
        }
        
        System.out.println(account.toString());
    }
}
