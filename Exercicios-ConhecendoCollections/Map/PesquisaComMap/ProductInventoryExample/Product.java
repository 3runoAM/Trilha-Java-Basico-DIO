package Set.PesquisaComMap.ProductInventoryExample;

import java.util.Objects;

public class Product {
    private long code;
    private String name;
    private int quantity;
    private double price;

    public Product(long code, String name, int quantity, double price) {
        this.code = code;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public long getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return getCode() == product.getCode();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getCode());
    }

    @Override
    public String toString() {
        return "Product: [Code: %d, Name: %s, Quantity: %d, Price: %.2f]".formatted(code, name, quantity, price);
    }
}
