package Set.OperacoesBasicasComMap.ContactListExample;

import java.util.HashMap;
import java.util.Map;

public class ContactMap {
    public static Map<String, Integer> contacts = new HashMap<>();

    public static Map<String, Integer> getContacts() {
        return contacts;
    }

    public static void addContact(String name, int number){
        contacts.put(name, number);
    }

    public static void removeContact(String name){
        contacts.remove(name);
    }

    public static void showAllContacts(){
        contacts.forEach((k,v) -> System.out.println(k + ", " + v));
    }

    public static int getContactNumber(String name){
        return contacts.get(name);
    }
}
