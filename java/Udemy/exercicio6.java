/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Udemy;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author luiz.grenteski
 */
public class exercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        Locale.setDefault(Locale.US);
        
        double pi = 3.14159;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("Digite valor de A: ");
        double A = sc.nextFloat();
        
        System.out.printf("Digite valor de B: ");
        double B = sc.nextFloat();
        
        System.out.printf("Digite valor de C: ");
        double C = sc.nextFloat();
        
        double triangulo = (A * C) / 2;
        double circulo =  pi * Math.pow(C, 2.0);
        double trapezio = ((A + B) * C) / 2;
        double quadrado = B * B;
        double retangulo = A * B;
                
        System.out.printf("TRINAGULO: %.3f %n", triangulo);
        System.out.printf("CIRCULO: %.3f %n", circulo);
        System.out.printf("TRAPEZIO: %.3f %n", trapezio);
        System.out.printf("QUADRADO: %.3f %n", quadrado);
        System.out.printf("RETANGULO: %.3f %n", retangulo);
        
        sc.close();
        
    }
}
