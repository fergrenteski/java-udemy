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
public class exercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("Digite os números para verificar os intervalos ([0,25], (25,50], (50,75], (75,100]) %n");
        
        System.out.printf("Digite um número: ");
        int A = sc.nextInt();
        
        System.out.printf("Digite outro número: ");
        int B = sc.nextInt();
        
        if (A >= 0 && A <= 25 && B >= 0 && B <= 25){
            System.out.printf("Intervalo [0,25]");
        } else if (A >= 25 && A <= 50 && B >= 25 && B <= 50){
            System.out.printf("Intervalo [25,50]");
        } else if (A >= 50 && A <= 75 && B >= 50 && B <= 75){
            System.out.printf("Intervalo [50,75]");
        } else if (A >= 75 && A <= 100 && B >= 75 && B <= 100){
            System.out.printf("Intervalo [70,100]");
        } else {
            System.out.printf("Fora do Invervalo");
        }
        
        sc.close();
    }
}
