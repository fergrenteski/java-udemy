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
public class aluguel {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Rent[] rentVect = new Rent[10];
        
        System.out.print("Quantos quartos ser�o alugados? ");
        int n = sc.nextInt();
        
        for(int i = 1; i <= n; i++){
            System.out.printf("Rent #%d:%n", i);
            System.out.printf("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.printf("E-mail: ");
            String email = sc.next();
            System.out.printf("Room: ");
            int roomNumber = sc.nextInt();
            System.out.println();
            rentVect[roomNumber] = new Rent(name, email);
        }
        
        System.out.println();
        System.out.println("Busy Rooms");
        for(int i = 1; i < 10; i++){
            if(rentVect[i] != null){
                System.out.println(i + " " + rentVect[i]);
            }
        }
        
        sc.close();
    }
}
