/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package ForEach;

/**
 *
 * @author luiz.grenteski
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        String[] vect = new String[]{"Maria", "Bob", "Alex"};
        
        for(int i = 0; i < vect.length; i++){
            System.out.println(vect[i]);
        }
        System.out.println("---------------");
        for (String obj : vect) {
            System.out.println(obj);
        }
    }
}
