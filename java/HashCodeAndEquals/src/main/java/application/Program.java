
package application;

import entities.Client;

/**
 *
 * @author luiz.grenteski
 */
public class Program {

    public static void main(String[] args) {
        
        Client c1 = new Client("Maria", "Maria@gmail.com");
        Client c2 = new Client("Maria", "Maria@gmail.com");
        
        
        String s1 = "Test";
        String s2 = "Test";
        
        // Método rápido de comparação
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        // Compara conteudo dos objetos
        System.out.println(c1.equals(c2));
        // Compara endereços de memória
        System.out.println(c1 == c2);
        // Compara Conteúdo
        System.out.println(s1.equals(s2));
    }
}
