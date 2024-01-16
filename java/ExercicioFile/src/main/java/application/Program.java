
package application;

import entities.Product;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
        
        List<Product> list = new ArrayList<>();
        
        System.out.println("Enter a file path: ");
        String strPath = sc.nextLine();
        
        File srcFile = new File(strPath);
        String srcFolder = srcFile.getParent();
        
        boolean sucess = new File(srcFolder + "\\out").mkdir();
        
        String tgtFile = srcFolder + "\\out\\summary.csv";
        
        try (BufferedReader br = new BufferedReader(new FileReader(strPath))){
            String itemCsv = br.readLine();
            while(itemCsv != null) {
                String[] fields = itemCsv.split(",");
                String name = fields[0];
                double value = Double.parseDouble(fields[1]);
                int quantity = Integer.parseInt(fields[2]);
                
                list.add(new Product(name, value, quantity));
                
                itemCsv = br.readLine();
            }
            
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(tgtFile))) {
                for(Product prd : list) {
                    bw.write(prd.getName() + ", " + String.format("%.2f", prd.totalValue()));
                    bw.newLine();
                }
                
                System.out.println(tgtFile + " Created");
                
            } catch (IOException ex) {
                System.out.println("Error: " + ex.getMessage());
            } 
            
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
