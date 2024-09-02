package OrdenacaoComSet.StudentSetExample;

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
    public String toString() {
        return "Student: [Name: %s, Registration Number: %d, Grade: %d]".formatted(name, registrationNumber, grade);
    }
}
