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
public class exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("Quantos numeros voce vai digitar? (limite 10): ");
        
        int n = sc.nextInt();
        while(n > 10 || n < 0) {
            System.out.printf("Número inválido, digite outro: ");
            n = sc.nextInt();
        }
        int[] vect = new int[n];

        for(int i = 0; i < vect.length; i++){
            System.out.printf("Digite um número: ");
            vect[i] = sc.nextInt();
        }
        
        System.out.printf("Número negativos: %n");
        for(int i = 0; i < vect.length; i++){
            if(vect[i] < 0){
            System.out.printf("%s%n", vect[i]);
            }
        }
        sc.close();
        
    }
}
