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
public class exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("Digite um número: ");
        int numero = sc.nextInt();
        
        if (numero < 0) {
            System.out.printf("NEGATIVO");
        } else {
            System.out.printf("POSITIVO");
        }
        
        sc.close();
    }
}
