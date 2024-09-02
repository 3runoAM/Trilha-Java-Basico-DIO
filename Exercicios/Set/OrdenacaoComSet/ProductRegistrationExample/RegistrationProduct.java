package Set.OrdenacaoComSet.ProductRegistrationExample;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class RegistrationProduct {
    private static Set<Product> productSet = new HashSet<Product>();

    public static Set<Product> getProductSet() {
        return productSet;
    }

    /**/
    public static void addProduct(Product product) {
        productSet.add(product);
    }

    public static void showProductsByNameAsc(){
        productSet.stream()
                .sorted(Comparator.comparing(Product::getName))
                .forEach(System.out::println);
    }

    public static void showProductsByPriceAsc(){
        productSet.stream()
                .sorted(Comparator.comparing(Product::getPrice))
                .forEach(System.out::println);
    }
}