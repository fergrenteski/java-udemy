
package application;

import entities.Students;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author luiz.grenteski
 */
public class Program {
    
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        Set<Students> set = new HashSet<>();
        
        System.out.print("How many students for course A? ");
        int n = sc.nextInt();
        includeStudents(set, n);
        
        System.out.print("How many students for course B? ");
        n = sc.nextInt();
        includeStudents(set, n);
        
        System.out.print("How many students for course C? ");
        n = sc.nextInt();
        includeStudents(set, n);

        System.out.println("Total students: " + set.size());
    }
    
    public static void includeStudents(Set set, Integer n) {
        
        for(int i = 0; i < n; i++) {
            int number = sc.nextInt();
            set.add(new Students(number));     
        }
    }
}
