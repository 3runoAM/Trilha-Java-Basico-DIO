package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Desafio {
    private static final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
    public static void main(String[] args) {
        // Desafio 1
        System.out.println("Ordered list: " + orderListAsc(numbers));
        // Desafio 2
        sumEvenNumbers(numbers).ifPresentOrElse(
                v -> System.out.println("Sum of even numbers is: " + v),
                () -> System.out.println("There are no even numbers"));
        // Desafio 3
        System.out.printf("All numbers %s positive\n", areAllNumbersPositive(numbers) ? "are" : "are not");
        // Desafio 4
        System.out.println("All positive numbers list: " + removeOddNumber(numbers));
        // Desafio 5
         averageOfNumbersGreaterThenFive(numbers).ifPresentOrElse(
                 v -> System.out.println("The average of the numbers greater than five is " + v),
                 () -> System.out.println("There are no numbers greater than five")
         );
         // Desafio 5
    }

    // Desafio 1
    public static List<Integer> orderListAsc(List<Integer> numbers){
        return numbers.stream()
                .sorted()
                .toList();
    }

    //Desafio 2
    public static Optional<Integer> sumEvenNumbers(List<Integer> numbers){
        return numbers.stream()
                .filter(n -> n % 2 == 0)
                .reduce(Integer::sum);
    }

    // Desafio 3
    public static boolean areAllNumbersPositive(List<Integer> numbers) {
        return numbers.stream()
                .allMatch(n -> n > 0);
    }

    // Desafio 4
    public static List<Integer> removeOddNumber(List<Integer> numbers) {
        return numbers.stream()
                .filter(num -> num % 2 == 0)
                .toList();
    }

    // Desafio 5
    public static Optional<Double> averageOfNumbersGreaterThenFive(List<Integer> numbers) {
        return Optional.of(numbers.stream()
                .filter(n -> n > 5)
                .collect(Collectors.averagingInt(Integer::intValue)));
    }

    // Desafio 6
    public static Optional<Integer> areNumbersGreaterThanTen(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n > 10)
                .findAny();
    }
}