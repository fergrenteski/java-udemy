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
public class exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite uma opção%n");
        System.out.printf("1. Alcool | 2. Gasolina | 3. Diesel | 4. SAIR %n");

        int opcao = sc.nextInt();
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (opcao != 4) {

            switch (opcao) {
                case 1 ->
                    alcool++;
                case 2 ->
                    gasolina++;
                case 3 ->
                    diesel++;
                default ->
                    System.out.printf("Opção Inválida%n");
            }
            opcao = sc.nextInt();
        }

        System.out.printf("MUITO OBRIGADO%n");
        System.out.printf("Alcool: %d%n", alcool);
        System.out.printf("Gasolina: %d%n", gasolina);
        System.out.printf("Diesel: %d%n", diesel);

        sc.close();
    }
}
