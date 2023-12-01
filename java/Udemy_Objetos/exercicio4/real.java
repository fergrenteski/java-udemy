/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Udemy_Objetos.exercicio4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author luiz.grenteski
 */
public class real {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Whats is the dollar price? ");
        double vDolar = sc.nextDouble();
        
        System.out.println("How many dollars will be bought? ");
        double qDolar = sc.nextDouble();
        
        System.out.printf("Amount to be paid in reais = %.2f", dolar.real(vDolar, qDolar));
              
        sc.close();
    }
}
