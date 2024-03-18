package stream.basics;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AvgOfAllNums {
    public static void main(String[] args) {
        Integer arr[] = { 1, 2, 3, 4, 5 };
        Supplier<Stream<Integer>> stream = () -> Arrays.asList(arr).stream();
        Double avg = stream.get().collect(Collectors.averagingInt(Integer::valueOf));
        System.out.println("Average of all numbers: " + avg);
    }
}
