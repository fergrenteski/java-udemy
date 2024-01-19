
package application;

import java.util.Locale;
import java.util.Scanner;
import services.PrintService;

/**
 *
 * @author luiz.grenteski
 */
public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("How Many values: ");
        int n = sc.nextInt();
        
        PrintService<String> print = new PrintService<>();
        
        for(int i = 0; i < n; i++) {
            String value = sc.next();
            print.addValue(value);
        }
        
        System.out.println();
        print.print();
        System.out.println("First: " + print.first());
        
        sc.close();
    }
}
