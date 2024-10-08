package Set.PesquisaComSet.ContactSetExample;

import java.util.Objects;

public class Contact {
    private String name;
    private int number;

    public Contact(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return getNumber() == contact.getNumber();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getNumber());
    }

    @Override
    public String toString() {
        return "Contact: [Name: %s, Number: %d]".formatted(name, number);
    }
}
