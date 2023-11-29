/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Udemy;

import java.util.Scanner;

/**
 *
 * @author luiz.grenteski
 */
public class exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        double raio;
        double area;
        double pi = 3.14159;
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("Digite o raio do círculo: %n");
        raio = sc.nextInt();

        area = pi * Math.pow(raio, 2.0);        
        
        System.out.printf("A área é: %.4f", area);
        sc.close();
    }
}
