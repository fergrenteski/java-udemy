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
public class exercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("Quantos valores vai ter cada vetor?: ");
        int n = sc.nextInt();
        
        int vectA[] = new int[n];
        int vectB[] = new int[n];
        int vectC[] = new int[n];
        
        System.out.printf("Digite os valores do vector A: %n");
        for(int i = 0; i < vectA.length; i++){
            System.out.printf("Digite um número: ");
            vectA[i] = sc.nextInt();
        }
        System.out.printf("%nDigite os valores do vector B: %n");
        for(int i = 0; i < vectA.length; i++){
            System.out.printf("Digite um número: ");
            vectB[i] = sc.nextInt();
            vectC[i] = vectA[i] + vectB[i];
        }
        System.out.printf("%nVetor resultante: %n");
        for(int i = 0; i < vectA.length; i++){
            System.out.println(vectC[i]);
        }
        sc.close();
    }
}
