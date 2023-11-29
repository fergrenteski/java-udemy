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
public class exercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("Digite o código da peça 1: ");
        int codigoPeca = sc.nextInt();
        
        System.out.printf("Digite a quantidade de peça 1: ");
        int qtdaPeca = sc.nextInt();
        
        System.out.printf("Digite o valor por peça 1: ");
        double valorPeca = sc.nextDouble();
        
        System.out.printf("Digite o código da peça 2: ");
        int codigoPeca2 = sc.nextInt();
        
        System.out.printf("Digite a quantidade de peça 2: ");
        int qtdaPeca2 = sc.nextInt();
        
        System.out.printf("Digite o valor por peça 2: ");
        double valorPeca2 = sc.nextDouble();
        
        double valorTotal = qtdaPeca * valorPeca + qtdaPeca2 * valorPeca2;
        
        System.out.printf("Valor a pagar: R$ %.2f %n", valorTotal);
        sc.close();
    }
}
