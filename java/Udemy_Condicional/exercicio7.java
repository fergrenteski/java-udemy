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
public class exercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("Digite as coordenadas x e y para verificar o quadrante %n");
        
        System.out.printf("Digite x: ");
        double x = sc.nextDouble();
        
        System.out.printf("Digite y: ");
        double y = sc.nextDouble();
        
        if (x == 0.0 && y == 0.0) {
			System.out.println("Origem");
		}
		else if (x == 0.0) {
			System.out.println("Eixo Y");
		}
		else if (y == 0.0) {
			System.out.println("Eixo X");
		}
		else if (x > 0.0 && y > 0.0) {
			System.out.println("Q1");
		}
		else if (x < 0.0 && y > 0.0) {
			System.out.println("Q2");
		}
		else if (x < 0.0 && y < 0.0) {
			System.out.println("Q3");
		}
		else {
			System.out.println("Q4");
		}
        
        sc.close();
    }
}
