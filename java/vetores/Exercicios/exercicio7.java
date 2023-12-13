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
public class exercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("Quantos valores vai ter o vetor?: ");
        int n = sc.nextInt();
        
        double vect[] = new double[n];
        double sum = 0;
        
        for(int i = 0; i < vect.length; i++){
            System.out.printf("Digite um número: ");
            vect[i] = sc.nextDouble();
            sum += vect[i];
        }
        
        double avg = sum / vect.length;
        
        System.out.printf("%nMedia do vetor: %.3f%n", avg);
        System.out.printf("Numero abaixo da média: %n");
        for(int i = 0; i < vect.length; i++){
            if(vect[i] < avg){
                System.out.println(vect[i]);
            }
        }
        
        sc.close();
    }
}
