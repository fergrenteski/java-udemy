/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package vetores.Exercicios;

import java.util.Locale;
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
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("Quantos numeros voce vai digitar?: ");
        int n = sc.nextInt();
        
        double vect[] = new double[n];
        double sum = 0;
        
        for(int i = 0; i < vect.length; i++){
            System.out.printf("Digite um número: ");
            vect[i] = sc.nextDouble();
            sum += vect[i];
        }
        
        double avg = sum / vect.length;
        
        System.out.println();
        System.out.printf("Valores: ");
        for(int i = 0; i < vect.length; i++){
            System.out.printf("%.2f ", vect[i]);
        }
        System.out.printf("%nSoma: %.2f", sum);
        System.out.printf("%nMedia: %.2f", avg);
        
        sc.close();
    }
}
