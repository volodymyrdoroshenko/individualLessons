package lessons.lesson3.HW1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>(Arrays.asList("Hello", "Hello", "World", "Java", "Hello", "Java"));
        System.out.println(strings);
        convertToUnique(strings);
        System.out.println(strings);
        System.out.println(convertToUniqueUsingStream(strings));
    }

    public static void convertToUnique(ArrayList<String> strings) {
        for (int i = 0; i < strings.size(); i++) {
            String temp = strings.get(i);
            for (int j = i + 1; j < strings.size(); j++) {
                if (temp.equals(strings.get(j))) {
                    strings.remove(j);
                    j--;
                }
            }
        }
    }

    public static ArrayList<String> convertToUniqueUsingStream(ArrayList<String> strings) {
        return strings.stream().distinct().collect(Collectors.toCollection(ArrayList::new));
    }
}
