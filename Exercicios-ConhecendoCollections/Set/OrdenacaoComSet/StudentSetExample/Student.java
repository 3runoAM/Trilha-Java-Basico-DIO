package Set.OrdenacaoComSet.StudentSetExample;

import java.util.Objects;

public class Student {
    private String name;
    private long registrationNumber;
    private int grade;

    public Student(String name, long registrationNumber, int grade) {
        this.name = name;
        this.registrationNumber = registrationNumber;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public long getRegistrationNumber() {
        return registrationNumber;
    }

    public int getGrade() {
        return grade;
    }

    /**/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return getRegistrationNumber() == student.getRegistrationNumber();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getRegistrationNumber());
    }

    @Override
    public String toString() {
        return "Student: [Name: %s, Registration Number: %d, Grade: %d]".formatted(name, registrationNumber, grade);
    }
}
