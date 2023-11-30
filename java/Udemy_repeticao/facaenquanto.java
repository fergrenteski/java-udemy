/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Udemy_repeticao;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author luiz.grenteski
 */
public class facaenquanto {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String resp;
        
        do {
            System.out.println("Digite a temperatura em Celsius: ");

            double C = sc.nextDouble();

            double F = (9.0 * C) / 5.0 + 32;

            System.out.printf("Equivalente em Fahrenheit: %.2f%n", F);
            System.out.printf("Deseja continuar? (s/n): ");
            resp = sc.next();

        } while (resp != "n");

        sc.close();
    }
}
