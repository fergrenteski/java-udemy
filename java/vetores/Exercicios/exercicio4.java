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
public class exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("Quantos numeros voce vai digitar?: ");
        int n = sc.nextInt();
        
        int vect[] = new int[n];
        
        for(int i = 0; i < vect.length; i++){
            System.out.printf("Digite um número: ");
            vect[i] = sc.nextInt();
        }
        
        int qtdPares = 0;
        
        System.out.printf("%nNumeros Pares: %n");
        for(int i = 0; i < vect.length; i++){
            if(vect[i] % 2 == 0){
                System.out.printf("%d ", vect[i]);
                qtdPares ++;
            }
        }
        
        System.out.printf("%n%nQuantidade de pares = %d",qtdPares);
        
        sc.close();
    }
}
