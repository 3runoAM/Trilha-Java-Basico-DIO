package sortingInList.sortedPersonExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedPerson {
    private static List<Person> personList = new ArrayList<Person>();

    public static List<Person> getPersonList() {
        return personList;
    }

    public static void addPerson(Person person) {
        personList.add(person);
    }

    public static void sortPersonList() {
        Collections.sort(personList);
    }

    public static void sortByHeight(){
        personList.sort(new PersonHeightComparator());
    }
}
