package lessons.lesson3.HW1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 4, 5, 56, 2, 3, 5, 0, -89));
        System.out.println(numbers);
        getSortedUniqueIntegersASC(numbers);
        System.out.println(numbers);
        System.out.println(getSortedUniqueIntegersASCUsingStream(numbers));
    }

    public static void getSortedUniqueIntegersASC(ArrayList<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            int temp = numbers.get(i);
            for (int j = i + 1; j < numbers.size(); j++) {
                if (temp == numbers.get(j)) {
                    numbers.remove(j);
                    j--;
                }
            }
        }
        Collections.sort(numbers);
    }

    public static ArrayList<Integer> getSortedUniqueIntegersASCUsingStream(ArrayList<Integer> numbers) {
        return numbers.stream().sorted().distinct().collect(Collectors.toCollection(ArrayList::new));
    }
}
