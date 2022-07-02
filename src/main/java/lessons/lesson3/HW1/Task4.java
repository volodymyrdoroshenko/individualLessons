package lessons.lesson3.HW1;

import java.util.*;
import java.util.stream.Collectors;

public class Task4 {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>(Arrays.asList("Don't", "repeat", "yourself", "Don't", "repeat",
                "yourself", "Java", "Hello", "Java"));
        System.out.println(strings);
        System.out.println(buildSentenceDirection(strings));
        System.out.println(buildSentenceDirectionUsingStream(strings));
    }

    public static LinkedHashSet<String> buildSentenceDirection(ArrayList<String> strings) {
        return new LinkedHashSet(strings);
    }

    public static LinkedList<String> buildSentenceDirectionUsingStream(ArrayList<String> strings) {
        return strings.stream().distinct().collect(Collectors.toCollection(LinkedList::new));
    }
}
