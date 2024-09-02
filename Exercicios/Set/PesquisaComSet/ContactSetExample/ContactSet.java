package  Set.PesquisaComSet.ContactSetExample;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class ContactSet {
    Set<Contact> contacts = new HashSet<Contact>();

    public ContactSet(Set<Contact> contacts) {
        this.contacts = contacts;
    }

    public Set<Contact> getContacts() {
        return contacts;
    }

    /**/
    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void showContacts() {
        contacts.forEach(System.out::println);
    }

    public Set<Contact> searchByName(String name){
        return contacts.stream()
                .filter(c -> c.getName().equalsIgnoreCase(name))
                .collect(Collectors.toSet());
    }

    public void updateContact(String name, int newNumber) {
        Optional<Contact> contactOp = contacts.stream()
                .filter(c -> c.getName().equalsIgnoreCase(name))
                .findFirst();

        contactOp.ifPresent(contact -> {
            contacts.remove(contact);
            contacts.add(new Contact(name, newNumber));
        });
    }
}
