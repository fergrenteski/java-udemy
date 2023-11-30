/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Udemy_repeticao;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author luiz.grenteski
 */
public class exercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.printf("%d %d %d%n", i , i*i , i*i*i );
        }

        sc.close();
    }
}
