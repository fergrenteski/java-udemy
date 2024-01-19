
package applcation;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author luiz.grenteski
 */
public class Program {

    public static void main(String[] args) {
        
        // HashSet :: Aleatório
        // TreeSet :: Ordenado (toCompare())
        // LinkedHashMap :: Ordenado pela inserção
        
        Set<String> set = new HashSet<>();
        
        set.add("TV");
        set.add("Notebook");
        set.add("Tablet");
        
       set.remove("Tablet");
       set.removeIf(x -> x.charAt(0) == 'T');
        
        for(String s : set) {
            System.out.println(s);
        }
    }
}
