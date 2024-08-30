package entities.basicOperationsWithList.shoppingCartExample;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private static List<Item> items = new ArrayList<Item>();

    public static void addItem(Item item) {
        items.add(0, item);
    }

    public static void removeItem(String name) {
        items.removeIf(i -> i.getName().equals(name));
    }

    public static double calculateTotal() {
        return items.stream()
                .mapToDouble(i -> i.getPrice() * i.getQuantity())
                .sum();
    }

    public void showCartItems(){
        System.out.println(items.toString());
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        items.stream().forEach(i -> sb.append(i.toString()));
        return sb.toString();
    }
}