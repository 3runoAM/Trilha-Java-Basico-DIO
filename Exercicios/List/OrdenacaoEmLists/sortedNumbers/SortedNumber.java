package List.OrdenacaoEmLists.sortedNumbers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedNumber {
    List<Integer> numbers = new ArrayList<Integer>();

    public void addNumber(int number) {
        numbers.add(number);
    }

    public void sortAsd(){
        Collections.sort(numbers);
    }

    public void sortDsc(){
        numbers.sort(Collections.reverseOrder());
    }
}
