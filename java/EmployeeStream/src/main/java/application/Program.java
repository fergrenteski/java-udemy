
package application;

import entities.Employee;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author luiz.grenteski
 */
public class Program {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter de full file Path: ");
        String path = sc.nextLine();
        
        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            
            String line = br.readLine();
            
            List<Employee> list = new ArrayList<>();
            
            while (line != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                String email = fields[1];
                Double salary = Double.valueOf(fields[2]);
                
                list.add(new Employee(name, email, salary));
                
                line = br.readLine();
            }
            
            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();
            
            List<String> emails = list.stream()
                    .filter(e -> e.getSalary() > salary)
                    .map(e -> e.getEmail())
                    .sorted((e1, e2) -> e1.toUpperCase().compareTo(e2.toUpperCase()))
                    .collect(Collectors.toList());
            
            double sum = list.stream()
                    .filter(e -> e.getName().toUpperCase().charAt(0) == 'M')
                    .map(p -> p.getSalary())
                    .reduce(0.0, (x,y)-> x + y);
            
            System.out.println("Emails of people whose salary is more than " + String.format("%.2f", salary) + ":");
            emails.forEach(System.out::println);
            System.out.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f", sum));
            
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
