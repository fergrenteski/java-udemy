
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author luiz.grenteski
 */
public class string {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        String original = "AAA bbb CcCc dEFG    Cc  ";

        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        String s04 = original.substring(2);
        String s05 = original.substring(2,9);
        String s06 = original.replace('A', 'X');
        int i = original.indexOf("Cc");
        int j = original.lastIndexOf("Cc");
        
        String[] vect = original.split(" ");
        String word1 = vect[0];
        String word2 = vect[1];
        
        System.out.println("Original: " + original);
        System.out.println("toLowerCase: " + s01);
        System.out.println("toUpperCase: " + s02);
        System.out.println("Trim: " + s03);
        System.out.println("Substring 1: " + s04);
        System.out.println("Substring 1 a 9: " + s05);
        System.out.println("Replace: " + s06);
        System.out.println("indexOf: " + i);
        System.out.println("LastIndexOf: " + j);
        System.out.println("Split[0]: " + vect[0]);
        System.out.println("Split[1]: " + vect[1]);
        
        sc.close();
    }
}
