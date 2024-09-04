package Stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Desafio {
    private static final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
    private static final List<Integer> empty = Collections.emptyList();
    public static void main(String[] args) {
        // Desafio 1
        System.out.println(orderListAsc(numbers));
        // Desafio 2
        System.out.println(sumEvenNumbers(numbers));
        // Desafio 3
        System.out.printf(areAllNumbersPositive(numbers));
        // Desafio 4
        System.out.println(removeOddNumber(numbers));
        // Desafio 5
        System.out.println(averageOfNumbersGreaterThenFive(numbers));
        // Desafio 6
        System.out.println(thereAreNumbersGreaterThanTen(numbers));
        // Desafio 7
        System.out.println(findSecondGreaterNumber(numbers));
        // Desafio 8
        System.out.println(sumOfAllNumbers(numbers));
        // Desafio 9
        System.out.println(areAllNumbersDistinct(numbers));
        // Desafio 10
        System.out.println(findMultiplesOfFiveOrThree(numbers));
        // Desafio 11
        System.out.println(sumOfSquares(numbers));
        // Desafio 12
        System.out.println(findProductOfAllNumbers(numbers));
        // Desafio 13
        System.out.println(findNumbersBetweenFiveAndTen(numbers));
        // Desafio 14
        System.out.println(findGreatestPrimeNumbersInList(numbers));
        // Desafio 15
        System.out.println(isThereANegativeNumber(numbers));
        // Desafio 16
        System.out.println(separateEvenAndOddNumbers(numbers));
        // Desafio 17
        System.out.println(findPrimeNumbersInList(numbers));
        // Desafio 18
        System.out.println(areAllNumbersEqual(numbers));
        // Desafio 19
        System.out.println(sumOfAllNumbersDivisibleByFiveAndThree(numbers));
    }

    // Desafio 1
    public static String orderListAsc(List<Integer> numbers){
        return "The list in ascending order: " + numbers.stream()
                .sorted()
                .toList();
    }

    //Desafio 2
    public static String sumEvenNumbers(List<Integer> numbers){
        Optional<Integer> numOp = numbers.stream()
                .filter(n -> n % 2 == 0)
                .reduce(Integer::sum);

        return numOp.map(integer -> "The sum of even numbers is " + integer).orElse("The list is empty");
    }

    // Desafio 3
    public static String areAllNumbersPositive(List<Integer> numbers) {
        return numbers.stream()
                .allMatch(n -> n > 0) ? "All numbers are positive" : "Some numbers are negative";
    }

    // Desafio 4
    public static String removeOddNumber(List<Integer> numbers) {
        return "The list without odd numbers: " + numbers.stream()
                .filter(num -> num % 2 == 0)
                .toList();
    }

    // Desafio 5
    public static String averageOfNumbersGreaterThenFive(List<Integer> numbers) {
        return Optional.of(numbers.stream()
                        .filter(n -> n > 5)
                        .collect(Collectors.averagingInt(Integer::intValue)))
                .map(v -> "There average of numbers greater then five is " + v)
                .orElse("There are no numbers greater then five");
    }

    // Desafio 6
    public static String thereAreNumbersGreaterThanTen(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n > 10)
                .findAny()
                .map(n -> "There is a number greater then five " + n)
                .orElse("There are no numbers greater than five");
    }

    // Desafio 7
    public static String findSecondGreaterNumber(List<Integer> numbers) {
        if (numbers.isEmpty()){
            return "Is an empty list";
        }
        return "The second greatest number is: " + numbers.stream()
                .sorted(Comparator.reverseOrder())
                .toList()
                .get(1);
    }

    // Desafio 8
    public static String sumOfAllNumbers(List<Integer> numbers) {
        return "The sum of all numbers is: " + numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

    // Desafio 9
    public static String areAllNumbersDistinct(List<Integer> numbers) {
        long size = numbers.stream()
                .distinct()
                .count();
        return size == numbers.size() ? "There's only distinct numbers in list" : "Some numbers repeat themselves";
    }

    // Desafio 10
    public static String findMultiplesOfFiveOrThree(List<Integer> numbers) {
        return "The multiples of five or ten in the list are: " + numbers.stream()
                .filter(n -> n % 3 == 0 || n % 5 == 0)
                .distinct()
                .toList();
    }

    // Desafio 11
    public static String sumOfSquares(List<Integer> numbers) {
        return "The sum of the squared numbers are: " + numbers.stream()
                .mapToInt(n -> n * n)
                .sum();
    }

    // Desafio 12
    public static String findProductOfAllNumbers(List<Integer> numbers) {
        return "The product of all numbers is: " + numbers.stream()
                .reduce(1, (accumulator, nextValue) -> accumulator * nextValue);
    }

    // Desafio 13
    public static String findNumbersBetweenFiveAndTen(List<Integer> numbers) {
        return "All numbers between five and ten are: " + numbers.stream()
                .filter(n -> n >= 5)
                .filter(n -> n <= 10)
                .toList();
    }

    // Desafio 14
    public static String findGreatestPrimeNumbersInList(List<Integer> numbers){
        return numbers.stream()
                .filter(n -> n > 1)
                .filter(n -> IntStream.range(2, n).noneMatch(i -> n % i == 0))
                .max(Comparator.naturalOrder())
                .map(v -> "The greatest prime number is: " + v)
                .orElse("There's no prime numbers in the list");
    }

    // Desafio 15
    public static String isThereANegativeNumber(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n < 0)
                .findFirst()
                .map(v -> "There are a negative numbers: " + v)
                .orElse("There are no negative numbers");
    }

    // Desafio 16
    public static String separateEvenAndOddNumbers(List<Integer> numbers) {
        List<Integer> evenNumber = numbers.stream().filter(num -> num % 2 == 0).toList();
        List<Integer> oddNumber = numbers.stream().filter(num -> num % 2 != 0).toList();

        return "The even number are " + evenNumber + " and the odd numbers are " + oddNumber;
    }

    // Desafio 17
    public static String findPrimeNumbersInList(List<Integer> numbers) {
        return "The prime numbers in the list are: " + numbers.stream()
                .filter(n -> n > 1)
                .filter(n -> IntStream.range(2, n).noneMatch(i -> n % i == 0))
                .toList();
    }

    // Desafio 18
    public static String areAllNumbersEqual(List<Integer> numbers) {
        if(numbers.isEmpty()){
            return "Is an empty list";
        }
        int firstNumber = numbers.get(0);
        return numbers.stream()
                .skip(1)
                .filter(n -> n != firstNumber)
                .toList()
                .isEmpty() ? "All numbers are equal" : "There are different numbers";
    }

    // Desafio 19
    public static String sumOfAllNumbersDivisibleByFiveAndThree(List<Integer> numbers) {
        return "The sum of all numbers divisible by five and three is: " + numbers.stream()
                .filter(n -> n % 3 == 0 && n % 5 == 0)
                .mapToInt(Integer::intValue)
                .sum();
    }
}