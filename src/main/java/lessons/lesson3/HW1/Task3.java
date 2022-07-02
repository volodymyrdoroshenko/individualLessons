package lessons.lesson3.HW1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 4, 5, 56, 2, 3, 5, 0, -89));
        System.out.println(numbers);
        getSortedUniqueIntegersDESC(numbers);
        System.out.println(numbers);
        System.out.println(getSortedUniqueIntegersDESCUsingStream(numbers));
    }

    public static void getSortedUniqueIntegersDESC(ArrayList<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            int temp = numbers.get(i);
            for (int j = i + 1; j < numbers.size(); j++) {
                if (temp == numbers.get(j)) {
                    numbers.remove(j);
                    j--;
                }
            }
        }
        numbers.sort(Collections.reverseOrder());
    }

    public static ArrayList<Integer> getSortedUniqueIntegersDESCUsingStream(ArrayList<Integer> numbers) {
        return numbers.stream().sorted(Collections.reverseOrder()).distinct().
                collect(Collectors.toCollection(ArrayList::new));
    }
}
