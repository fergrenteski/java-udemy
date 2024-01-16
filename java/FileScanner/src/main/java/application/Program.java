package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author luiz.grenteski
 */
public class Program {

    public static void main(String[] args) {

        File file = new File("c:\\temp\\in.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException ex) {
            System.out.println("Error" + ex.getMessage());
        } finally {
            if(sc != null) {
                sc.close();
            }
        }

    }
}
