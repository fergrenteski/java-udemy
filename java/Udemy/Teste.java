/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Udemy;

import java.util.Scanner;

/**
 *
 * @author luiz.grenteski
 */
public class Teste {

    public static void main(String[] args) {
        System.out.println("Seu nome: ");
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        System.out.printf("%s", x);
        sc.close();
    }
}