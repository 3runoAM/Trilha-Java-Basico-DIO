package entities.basicOperationsWithList.shoppingCartExample;

public class Item {
    private final String name;
    private final double price;
    private final int quantity;

    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String toString(){
        return "Item: Name: %s;\nPrice: %s;\nQuantity: %d\n".formatted(name, price, quantity);
    }
}