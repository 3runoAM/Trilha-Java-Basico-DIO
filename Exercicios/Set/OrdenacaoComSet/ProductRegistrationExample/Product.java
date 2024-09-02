package Set.OrdenacaoComSet.ProductRegistrationExample;

import java.util.Objects;

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

    public String toString() {
        return "Product: [Code: %d, Name: %s, Price: %.2f , Quantity: %d]".formatted(code, name, price, quantity);
    }
}
