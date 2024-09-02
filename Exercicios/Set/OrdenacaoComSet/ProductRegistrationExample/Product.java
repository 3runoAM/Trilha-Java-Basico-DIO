package OrdenacaoComSet.ProductRegistrationExample;

public class Product {
    private long code;
    private String name;
    private double price;
    private int quantity;

    public Product(long code, String name, double price, int quantity) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public long getCode() {
        return code;
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

    /**/


    public String toString() {
        return "Product: [Code: %d, Name: %s, Price: %.2f , Quantity: %d]".formatted(code, name, price, quantity);
    }
}
