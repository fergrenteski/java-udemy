/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Udemy_repeticao;

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
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de números:");
        int n = sc.nextInt();
        int x = 0;
        int in = 0;
        int out = 0;
        
        for(int i = 0; i < n; i++) {
            x = sc.nextInt();
            
            if (x >= 10 && x <= 20) {
                in++;
            } else {
                out++;
            }
        }
        
        System.out.printf("%d in%n", in);
        System.out.printf("%d out%n", out);
        
        sc.close();
    }
}
