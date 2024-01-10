/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package application;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author luiz.grenteski
 */
public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        List<TaxPayer> list = new ArrayList<>();
        
        System.out.print("Enter the number of taxpayers: ");
        int n = sc.nextInt();
        
        for(int i = 1; i <= n; i++) {
            System.out.print("Taxpayer #" + i + " data: \n");
            System.out.print("Individual or company (i/c): ");
            char ic = sc.next().charAt(0);
            
            System.out.print("Name: ");
            String name = sc.next();
            
            System.out.print("Anual income: ");
            double income = sc.nextDouble();
            
            switch (ic) {
                case 'i' -> {
                    System.out.print("Health expenditures: ");
                    Double healtExpenditures = sc.nextDouble();
                    list.add(new Individual(healtExpenditures, name, income));
                    break;
                }
                case 'c' -> {
                    System.out.print("Number of employees: ");
                    int numberOfEmployees = sc.nextInt();
                    list.add(new Company(numberOfEmployees, name, income));
                    break;
                }
            }
        }
        
        System.out.println();
        System.out.println("TAXES PAID:");
        
        Double sumTaxes = 0.0;
        
        for(TaxPayer taxPayer : list) {
            System.out.println(taxPayer.toString());
            sumTaxes += taxPayer.tax();
        }
        
        System.out.println();
        System.out.printf("TOTAL TAXES: $ %.2f", sumTaxes);
        
        sc.close();
    }
}
