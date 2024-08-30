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

    public  boolean equals(Object o) {
        if (this == o) return true; // Veriricação de identidade, os dois objetos são o mesmo na memória
        if (o == null || this.getClass() != o.getClass()) return false; // Compara nulidade e classe
        Item item = (Item) o; // Converte o objeto para Item
        return this.name.equals(item.name) && this.price == item.price && this.quantity == item.quantity; // Compara os valores dos atributos
    }
}