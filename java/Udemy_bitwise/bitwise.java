/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Udemy_bitwise;

import java.util.Scanner;

/**
 *
 * @author luiz.grenteski
 */
public class bitwise {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int mask = 0b100000;
        int n = sc.nextInt();
        
        if((n & mask) !=0) {
            System.out.println("6th bit is true!");
        } else {
            System.out.println("6th bit is true!");
        }
        sc.close();
    }
}
