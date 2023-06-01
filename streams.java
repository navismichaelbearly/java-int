import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class streams {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(6, 5, 2, 8, 1, 7);

        // Predicate<Integer> predi = new Predicate<Integer>() {
        // @Override
        // public boolean test(Integer n) {
        // return n % 2 == 1;
        // }
        // };

        Predicate<Integer> predi = n -> n % 2 == 1;

        int result = nums.stream()
                .filter(n -> n % 2 == 1)
                .sorted()
                .map(n -> n * 2)
                .reduce(0, (c, e) -> c + e);

        System.out.println(result);

        // nums.stream()
        // // .filter(n -> n % 2 == 1)
        // .filter(predi)
        // .sorted()
        // .map(n -> n * 2)
        // .forEach(n -> System.out.println(n));

        // Stream<Integer> mappedData = data
        // mappedData

        // long count = data.count();
        // data.forEach(n -> System.out.println(n));
        // Stream<Integer> sortedData = data.sorted();
        // sortedData.forEach(n -> System.out.println(n));

        // normal way to double
        // for (int n : nums) {
        // System.out.println(n * 2);
        // }

    }
}
