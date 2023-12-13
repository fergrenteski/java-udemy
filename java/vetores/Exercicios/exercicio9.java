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
public class exercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double maisVelhaIdade = 0;
        String maisVelhaNome = "";
        
        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        String[] nomes = new String[n];
        double[] idades = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            System.out.print("Nome: ");
            nomes[i] = sc.next();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
            //Verifica se a idade digitada é maior que a idade mais velha
            if(idades[i] > maisVelhaIdade) {
                
                maisVelhaIdade = idades[i];
                maisVelhaNome = nomes[i];
            }
        }
        
        System.out.printf("Pessoa mais velha: %s", maisVelhaNome);

        sc.close();
    }
}
