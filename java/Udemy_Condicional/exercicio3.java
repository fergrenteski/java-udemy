/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Udemy_Condicional;

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
        
        System.out.printf("Digite um número: ");
        int A = sc.nextInt();
        
        System.out.printf("Digite outro número: ");
        int B = sc.nextInt();
        
        if (A % B == 0 || B % A == 0) {
            System.out.printf("São Múltiplos");
        } else {
            System.out.printf("Não são múltiplos");
        }
        
        sc.close();
    }
}