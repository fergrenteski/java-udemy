
package application;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author luiz.grenteski
 */
public class Program {

    public static void main(String[] args) {
        
        Map<String, String> cookies = new TreeMap<>();
        
        cookies.put("username", "maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "99711122");
        
        cookies.remove("email");
        cookies.put("phone", "12231213");
        
        System.out.println("Cointais 'phone' key: " + cookies.containsKey("phone"));
        System.out.println("Phone number: " + cookies.get("phone"));
        System.out.println("Email: " + cookies.get("email")); // Retorna nulo
        System.out.println("Size: " + cookies.size());
        
        System.out.println("All cookies: ");
        
        for(String key : cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));
        }
    }
}
