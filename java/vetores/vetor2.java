/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package vetores;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author luiz.grenteski
 */
public class vetor2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
       
        int n = sc.nextInt();
        Product[] vect = new Product[n];
        
        double sum = 0.0;
        
        for(int i = 0; i < vect.length; i++){
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
            sum += vect[i].getPrice();
        }
        double avg = sum / vect.length;
        
        System.out.printf("Avg: %.2f%n", avg);
        
        sc.close();
    }
}
