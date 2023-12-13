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
public class exercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //Coloca a localização em US
         Locale.setDefault(Locale.US);
         
        //Instancia o Scanner
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("Quantos valores vai ter o vetor?: ");
        int n = sc.nextInt();
        
        //inicializa os vetores e variaveis
        int vect[] = new int[n];
        double sum = 0;
        int vectPar = 0;
        
        for(int i = 0; i < vect.length; i++){
            //Solicita a digitação de um número
            System.out.printf("Digite um número: ");
            vect[i] = sc.nextInt();
            //Verifica se o número é par
            if(vect[i] % 2 == 0){
            //Realiza a soma dos pares    
            sum += vect[i];
            //Realiza a soma para mostrar a quantidade de pares
            vectPar++;
            }
        }
        
        //Realiza a media dos pares
        double avg = sum / vectPar;
        
        //Mostra na tela se nenhum numero é par ou ser for, mostra a média deles
        if(sum == 0){
            System.out.printf("Nenhum numero par %n");
        } else {
            System.out.printf("%nMedia dos pares: %.3f%n", avg);
        }
        //Fecha o Scanner
        sc.close();
    }
}
