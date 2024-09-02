package sortingInList.sortedPersonExample;

import java.util.*;
import java.util.stream.Collectors;

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

    public static void main(String[] args){
        personList.addAll(Arrays.asList(new Person("Gernan", 36, 180),
                                        new Person("Bruno", 24, 168),
                                        new Person("Michelle", 22, 140)));

    }
}
