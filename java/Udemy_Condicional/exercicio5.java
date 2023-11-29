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
public class exercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("Código |   Especificação  | Preço  %n");
        System.out.printf("   1   |  Cachorro Quente | R$4,00 %n");
        System.out.printf("   2   |      X-Salada    | R$4,50 %n");
        System.out.printf("   3   |      X-Bacon     | R$5,00 %n");
        System.out.printf("   4   |  Torrada Simples | R$2,00 %n");
        System.out.printf("   5   |   Refrigerante   | R$1,50 %n");
        
        int opcao = 0;
        double valorTotal = 0.0;
        
        System.out.printf("Escolha os produtos pelo código (Digite 0 para terminar)%n");
        
        do {
            System.out.printf("(0 para sair) Produto: ");
        opcao = sc.nextInt();
        
        switch(opcao) {
            case 0:
                System.out.println();
                break;
                
            case 1:
                valorTotal += 4.00;
                System.out.printf("Produto selecionado: Cachorro Quente | Valor Parcial R$ %.2f%n", valorTotal);
                break;
            
            case 2:
                valorTotal += 4.50;
                System.out.printf("Produto selecionado: X-Salada | Valor Parcial R$ %.2f%n", valorTotal);
                break;
            
            case 3:
                valorTotal += 5.00;
                System.out.printf("Produto selecionado: X-Bacon | Valor Parcial R$ %.2f%n", valorTotal);
                break;
            
            case 4:
                valorTotal += 2.00;
                System.out.printf("Produto selecionado: Torrada Simples | Valor Parcial R$ %.2f%n", valorTotal);
                break;
            
            case 5:
                valorTotal += 1.50;
                System.out.printf("Produto selecionado: Refrigerante | Valor Parcial R$ %.2f%n", valorTotal);
                break;
            
            default:
                System.out.printf("Opção inválida! %n");
                break;
            }
        } while(opcao != 0);
        
        System.out.printf("Valor Total: R$ %.2f %n", valorTotal);
        sc.close();
    }
}
