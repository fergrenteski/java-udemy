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
public class exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        
        
        for(int i = 1; i < x; i++)
            if(i % 2 != 0) {
                System.out.printf("%d%n", i);
            }
        sc.close();
    }
}
