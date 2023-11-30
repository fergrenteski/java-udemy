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
public class exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        int senha = 0;
        senha = sc.nextInt();
        while(senha != 2002) {
            senha = sc.nextInt();
            System.out.printf("Senha inválida %n");
        }
        System.out.printf("Aceso permitido %n");
    }
}
