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
public class exercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        double[] altura = new double[n];
        char[] genero = new char[n];
        
        double sumMulheres = 0;
        int qtdaHomens = 0;
        int qtdaMulheres = 0;

        for (int i = 0; i < n; i++) {
            System.out.printf("Altura da %da pessoa: ", i + 1);
            altura[i] = sc.nextDouble(); 
            System.out.printf("Genero da %da pessoa(M / F): ", i + 1);
            genero[i] = sc.next().charAt(0);
            
            if(genero[i] == 'F') {
                sumMulheres += altura[i];
                qtdaMulheres++;
            } 
            if (genero[i] == 'M') {
                qtdaHomens++;
            }
        }
        
        double menorAltura = altura[0];
        double maiorAltura = altura[0];
        
        for (int i = 0; i < n; i++) {
            //Maior Altura
           if(altura[i] > maiorAltura) {
               maiorAltura = altura[i];
           }
           //Menor Altura
           if(altura[i] < menorAltura){
               menorAltura = altura[i];
           }
        }
        
        double avgMulheres = sumMulheres / qtdaMulheres;
        
        System.out.printf("Menor Altura = %.2f%n", menorAltura);
        System.out.printf("Maior Altura = %.2f%n", maiorAltura);
        System.out.printf("Media de altura das mulheres = %.2f%n", avgMulheres);
        System.out.printf("Numero de homens = %d%n", qtdaHomens);
        
        sc.close();
    }
}
