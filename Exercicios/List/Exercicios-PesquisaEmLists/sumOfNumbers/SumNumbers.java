package findInList.sumOfNumbers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SumNumbers {
    private static List<Integer> numbers = new ArrayList<Integer>();

    public static void addNumber(int number) {
        numbers.add(0, number);
    }

    public static int getSumOfNumbers() {
        return numbers.stream()
                .mapToInt(n -> n)
                .sum();
    }

    public static Optional<Integer> getMax() {
        return numbers.stream()
                .max(Integer::compare);
    }

    public static Optional<Integer> getMin() {
        return numbers.stream()
                .min(Integer::compare);
    }

    public static List<Integer> showNumbers() {
        return numbers;
    }
}