/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Udemy;

import java.util.Scanner;

/**
 *
 * @author luiz.grenteski
 */
public class exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("Escreva o primeiro número: ");
        int A = sc.nextInt();
        
        System.out.printf("Escreva o segundo número: ");
        int B = sc.nextInt();
        
        System.out.printf("Escreva o terceiro número: ");
        int C = sc.nextInt();
        
        System.out.printf("Escreva o quarto número: ");
        int D = sc.nextInt();
        
        int diferenca = A * B - C * D;
        
        System.out.printf("DIFERENCA = %d", diferenca);
        sc.close();
        
        
    }
}
