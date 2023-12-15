/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package ExMatriz;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author luiz.grenteski
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        
        for (int[] mat1 : mat) {
            for (int j = 0; j < mat[1].length; j++) {
                mat1[j] = sc.nextInt();
            }
        }
        
        System.out.printf("Main Diagonal: %n");
        for(int i = 0; i < n; i++){
            System.out.print(mat[i][i] + " ");
        }
        
        System.out.println();
        
        int negatives = 0;
        for (int[] mat1 : mat) {
            for (int j = 0; j < mat1.length; j++) {
                if (mat1[j] < 0) {
                    negatives++;
                }
            }
        }
        
        System.out.printf("Negative numbers: %d%n", negatives);
        
        
        sc.close();
    }
}
