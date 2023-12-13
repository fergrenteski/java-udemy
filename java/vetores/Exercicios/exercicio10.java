/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package vetores.Exercicios;

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
        
        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        String[] nomes = new String[n];
        double[] nota1 = new double[n];
        double[] nota2 = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            System.out.printf("Nome: ");
            sc.nextLine();
            nomes[i] = sc.nextLine();
            System.out.printf("Nota 1: ");
            nota1[i] = sc.nextDouble(); 
            System.out.printf("Nota 2: ");
            nota2[i] = sc.nextDouble();
        }
        
        System.out.printf("Alunos Aprovados: %n");
        for (int i = 0; i < n; i++) {
            if(((nota1[i] + nota2[i]) / 2) >= 6.0){
                System.out.println(nomes[i]);
            }
        }
        sc.close();
    }
}
