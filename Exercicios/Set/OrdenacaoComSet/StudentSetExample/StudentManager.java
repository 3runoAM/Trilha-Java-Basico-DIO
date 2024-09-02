package OrdenacaoComSet.StudentSetExample;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class StudentManager {
    private static Set<Student> studentSet = new HashSet<Student>();

    public static Set<Student> getStudentSet() {
        return studentSet;
    }

    public static void addStudent(Student student) {
        studentSet.add(student);
    }

    public static void removeStudent(long registrationNumber) {
        Optional<Student> studentOp = studentSet.stream()
                .filter(s -> s.getRegistrationNumber() == registrationNumber)
                .findFirst();

        studentOp.ifPresent(student ->{
            studentSet.remove(student);
        });
    }

    public static void showStudentsByNameAsc(){
        studentSet.stream()
                .sorted(Comparator.comparing(Student::getName))
                .forEach(System.out::println);
    }

    public static void showStudentsByGradeAsc(){
        studentSet.stream()
                .sorted(Comparator.comparing(Student::getGrade))
                .forEach(System.out::println);
    }
}
