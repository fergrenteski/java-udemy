/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Udemy_Objetos;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author luiz.grenteski
 */
public class Produto {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Product product = new Product();
        
        System.out.println("Enter product Data:");
        System.out.printf("Name: ");
        product.name = sc.nextLine();
        
        System.out.printf("Price: ");
        product.price = sc.nextDouble();
        
        System.out.printf("Quantity: ");
        product.quantity = sc.nextInt();
        
        System.out.println();
        System.out.println("Product data: " + product);

        System.out.printf("Enter the number of products top be added to stock: ");
        int quantity = sc.nextInt();
        product.AddProducts(quantity);
        
        System.out.println("Updated data: " + product);
        
        System.out.printf("Enter the number of products top be remove from stock: ");
        quantity = sc.nextInt();
        product.RemoveProducts(quantity);
        
        System.out.println("Updated data: " + product);
    }
}
