/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Udemy_Objetos.exercicio1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author luiz.grenteski
 */
public class retangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Retangle retangle = new Retangle();
        System.out.printf("Enter retangle widht and height: %n");
        retangle.width = sc.nextDouble();
        retangle.height = sc.nextDouble();
        
        System.out.printf("Area = %.2f%n", retangle.area());
        System.out.printf("Perimeter = %.2f%n", retangle.perimeter());
        System.out.printf("Diagonal = %.2f%n", retangle.diagonal());
        
        sc.close();
    }
}
