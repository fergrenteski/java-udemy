/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Udemy_Objetos.exercicio2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author luiz.grenteski
 */
public class funcionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();
        
        System.out.printf("Name: ");
        employee.name = sc.nextLine();
        
        System.out.printf("Gross Salary: ");
        employee.grossSalary = sc.nextDouble();
        
        System.out.printf("Tax: ");
        employee.tax = sc.nextDouble();
        
        System.out.println("Employee: " + employee);
        
        System.out.printf("Which percentage to increse salary? ");
        double percentage = sc.nextDouble();
        employee.IncreseSalary(percentage);
        
        System.out.println("Employee: " + employee);

        sc.close();
    }
}
