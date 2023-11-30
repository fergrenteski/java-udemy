
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author luiz.grenteski
 */
public class maiorNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("digite 3 números: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int maior = max(a, b, c);
        
        showResult(maior);
        
        sc.close();
    }
    
    public static int max(int a, int b, int c){
        int maior;
        if (a > b && a > c){
            maior = a;
        } else if (b > c) {
            maior = b;
        } else {
            maior = c;
        } return maior;
    }
    
    public static void showResult(int maior) {
        System.out.print("Maior: " + maior);
    }
}
