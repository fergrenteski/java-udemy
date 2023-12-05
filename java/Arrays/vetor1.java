/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Arrays;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author luiz.grenteski
 */
public class vetor1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
       
        int n = sc.nextInt();
        double[] vect = new double[n];
        
        for(int i = 0; i < vect.length; i++){
            vect[i] = sc.nextDouble();
        }
        
        double sum = 0.0;
        for(int i = 0; i < vect.length; i++){
            sum +=vect[i];
        }
        double avg = sum / vect.length;
        
        System.out.printf("%.2f", avg);
        
        sc.close();
    }
}
