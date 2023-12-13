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
public class exercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("Quantos numeros voce vai digitar?: ");
        int n = sc.nextInt();
        
        double vect[] = new double[n];
        for(int i = 0; i < vect.length; i++){
            System.out.printf("Digite um número: ");
            vect[i] = sc.nextDouble();
        }
        
        double maiorNumero = vect[0];
        int posicao = 0;
        
        for(int i = 0; i < vect.length; i++){
            if(maiorNumero < vect[i]){
                maiorNumero = vect[i];
                posicao = i;
            }
        }
        
        System.out.printf("%nMaior Valor = %.2f", maiorNumero);
        System.out.printf("%nPosição do maior valor = %d", posicao);
        
        sc.close();
    }
}
