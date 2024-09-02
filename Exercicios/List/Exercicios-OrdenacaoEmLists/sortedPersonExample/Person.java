package sortingInList.sortedPersonExample;

public class Person implements Comparable<Person> {
    private final String name;
    private final int age;
    private final double height;

    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public int compareTo(Person person){
        return Integer.compare(this.age, person.age);
    }

    public String toString() {
        return "Person: [Name: %s, Age: %d, Height: %.2f]".formatted(name, age, height);
    }
}