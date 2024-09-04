package Set.PesquisaComMap.ProductInventoryExample;

import java.util.*;

public class Inventory {
    private static Map<Long, Product> inventory = new HashMap<Long, Product>();

    public static Map<Long, Product> getInventory() {
        return inventory;
    }

    public static void addProduct(Product product) {
        inventory.put(product.getCode(), product);
    }

    public static void showInventory() {
        inventory.forEach((k,v) -> System.out.printf("%s: %d", v.getName(), v.getQuantity()));
    }

    public static double calculateTotalInventoryValue() {
        return inventory.values()
                .stream()
                .mapToDouble(p -> p.getQuantity() * p.getPrice())
                .sum();
    }

    public static Optional<Product> getMostExpensiveProduct() {
        return inventory.values()
                .stream()
                .max(Comparator.comparing(Product::getPrice));
    }

    public static Optional<Product> getLessExpansiveProduct() {
        return inventory.values()
                .stream()
                .min(Comparator.comparing(Product::getPrice));
    }

    public static Optional<Product> getHighestTotalInventoryValueProduct(){
        return inventory.values()
                .stream()
                .max(Comparator.comparing(p -> p.getPrice() * p.getQuantity()));
    }
}
