/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package listExercicio;

import java.util.ArrayList;
import java.util.List;
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

        List<Employees> list = new ArrayList<>();

        System.out.printf("How many employees will be registered? ");
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.printf("Employee #%d: %n", i + 1);
            System.out.printf("Id: ");
            Integer id = sc.nextInt();
            while (hasId(list, id)) {
                System.out.printf("Id already exists! Try again: ");
                id = sc.nextInt();
            }
            System.out.printf("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.printf("Salary: ");
            Double salary = sc.nextDouble();

            Employees emp = new Employees(id, name, salary);

            list.add(emp);
        }

        System.out.println();
        System.out.print("Enter the employee id that will have salary increase : ");
        int idsalary = sc.nextInt();

        Employees emp = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);

        if (emp == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percent = sc.nextDouble();
            emp.IncreaseSalary(percent);
        }

        System.out.println();
        System.out.println("List of employees:");
        for (Employees e : list) {
            System.out.println(e);
        }

        sc.close();
    }

    public static boolean hasId(List<Employees> list, int id) {
        Employees emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
