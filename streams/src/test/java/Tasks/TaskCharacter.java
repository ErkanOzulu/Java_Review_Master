package Tasks;

import java.util.Arrays;
import java.util.List;

public class TaskCharacter {
    public static void main(String[] args) {

        //Given a list of words, print the number of characters for each word.

        List<String> words = Arrays.asList("Java", "Apple", "Honda", "Developer");

        String x = "Java";

        System.out.println(x.length());

        System.out.println("---stream----");

        words.stream().map(i -> i.length()).forEach(i -> System.out.println(i));

        System.out.println("--- Shortest way ---");

        words.stream()
                .map(String::length)
                .forEach(System.out::println);


    }
}
