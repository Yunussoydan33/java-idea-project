import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Sample data
        List<String> fruits = Arrays.asList("apple", "banana", "orange", "grape", "pineapple");

        // Example 1: Filter elements starting with 'a' and convert to uppercase
        List<String> filteredAndUppercase = fruits.stream()
                .filter(fruit -> fruit.startsWith("a"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("Filtered and Uppercase fruits starting with 'a': " + filteredAndUppercase);

        // Example 2: Count the number of fruits containing letter 'e'
        long countOfFruitsWithE = fruits.stream()
                .filter(fruit -> fruit.contains("e"))
                .count();

        System.out.println("Number of fruits containing letter 'e': " + countOfFruitsWithE);
    }
}