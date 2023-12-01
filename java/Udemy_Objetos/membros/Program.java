/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Udemy_Objetos.membros;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author luiz.grenteski
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    
    public static final double PI = 3.14159;
    
    public static void main(String args[]) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();
        
        double c = circumference(radius);
        
        double v = volume(radius);
        
        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.5f%n", PI);
        sc.close();
    }
    
    public static double circumference(double radius){
        return 2.0 * PI * radius;
    }
    
    public static double volume(double radius){
        return 4.0 * PI * radius * radius * radius / 3.0;
    }
}
