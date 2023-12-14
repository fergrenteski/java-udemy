/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package listaexemplo;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 *
 * @author luiz.grenteski
 */
public class ListExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        List<String> list = new ArrayList<>();
        
        list.add("TESTE");
        list.add("Anna");
        list.add("TESTE12312");
        list.add("TESTE");
        
        list.add(2, "marco");
        System.out.println(list.size());
        
        list.remove("Anna");

        for(String x : list){
            System.out.println(x);
        }
        
        System.out.println("--------------------------");
        
        list.removeIf(x -> x.charAt(0) == 'T');
        
        for(String x : list){
            System.out.println(x);
        }
        
        System.out.println("--------------------------");
        System.out.println("Index do marco: " + list.indexOf("marco"));
        list.add("Anna");
        list.add("TESTE12312");
        list.add("TESTE");
        
        System.out.println("--------------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'T').collect(Collectors.toList());
        
        for(String x : result){
            System.out.println(x);
        }
        
        System.out.println("--------------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'T').findFirst().orElse(null);
        
        System.out.println(name);
    }
}
