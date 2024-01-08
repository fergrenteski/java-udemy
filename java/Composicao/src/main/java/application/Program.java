/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Departament;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

/**
 *
 * @author fergrenteski
 */
public class Program {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");

        System.out.printf("Enter departament's name: ");
        String departamentName = sc.nextLine();

        System.out.println("Enter worker data: ");
        System.out.printf("Name: ");
        String workerName = sc.nextLine();

        System.out.printf("Level: ");
        String workerLevel = sc.nextLine();

        System.out.printf("Base Salary: ");
        double workerBaseSalary = sc.nextDouble();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), workerBaseSalary,
                new Departament(departamentName));

        System.out.printf("How many contracts to this worker?: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("Enter contract number#%d: data: %n", i + 1);
            System.out.printf("Date (DD/MM/YYY): ");
            Date contractDate = sdf.parse(sc.next());
            System.out.printf("Value per hour: ");
            double valuePerhour = sc.nextDouble();
            System.out.printf("Duration (hours): ");
            int hours = sc.nextInt();

            HourContract contract = new HourContract(contractDate, valuePerhour, hours);
            worker.addContract(contract);
        }

        System.out.println();
        System.out.printf("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();

        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name: " + worker.getName());
        System.out.println("Departament: " + worker.getDepartament().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

        sc.close();
    }
}
