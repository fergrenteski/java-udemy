package application;

import entities.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 *
 * @author luiz.grenteski
 */
public class PredicateTest {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));
        
        list.removeIf(p -> p.getPrice() >= 100.0);
        // (p -> p.getPrice >= 100.00) 
        // new ProductPredicate()
        // Product::staticProductPredicate 
        // Product::nonStaticProductPredicate
        // Predicate<Product> pred = p -> p.getPrice() >= 100.0;
        
        for(Product p : list) {
            System.out.println(p);
        }
    }
}
