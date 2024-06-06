import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * This program demonstrates the use of ChatGPT to generate a complex Java code snippet.
 * It involves a custom class, an interface, and lambda expressions.
 */
public class ComplicatedCodeExample {

    interface CustomPredicate<T> {
        boolean test(T t);
    }

    static class CustomFilter<T> {
        List<T> filter(List<T> list, CustomPredicate<T> predicate) {
            List<T> result = new ArrayList<>();
            for (T item : list) {
                if (predicate.test(item)) {
                    result.add(item);
                }
            }
            return result;
        }
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        CustomFilter<Integer> customFilter = new CustomFilter<>();

        // Using a custom predicate with a lambda expression to filter even numbers
        List<Integer> evenNumbers = customFilter.filter(numbers, (Integer n) -> n % 2 == 0);

        System.out.println("Original Numbers: " + numbers);
        System.out.println("Filtered Even Numbers: " + evenNumbers);
    }
}
