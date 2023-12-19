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
public class exercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("Calculador de Imposto de Renda Lisarb:%n");
        System.out.printf("Renda                   | Imposto de renda %n");
        System.out.printf("de 0.00 à 2000.00       |      isento      %n");
        System.out.printf("de 2000.01 até 3000.00  |       08 %%       %n");
        System.out.printf("de 2000.01 até 3000.00  |       18 %%       %n");
        System.out.printf("de 2000.01 até 3000.00  |       28 %%       %n");

        System.out.printf("%nDigite seu salário: ");
        double salario = sc.nextDouble();
        double imposto;
        
        if (salario <= 2000.0) {
			imposto = 0.0;
		}
		else if (salario <= 3000.0) {
			imposto = (salario - 2000.0) * 0.08;
		}
		else if (salario <= 4500.0) {
			imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
		}
		else {
			imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}

		if (imposto == 0.0) {
			System.out.println("Isento");
		}
		else {
			System.out.printf("R$ %.2f%n", imposto);
		}
		sc.close();
    }
}
