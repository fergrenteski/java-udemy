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
public class exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        int a, b;
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("Digite o primeiro número: %n");
        a = sc.nextInt();
        System.out.printf("Digite o Segundo número: %n");
        b = sc.nextInt();
        
        int soma = a + b;
        
        System.out.printf("A Soma é: %d", soma);
        sc.close();
    }
}
