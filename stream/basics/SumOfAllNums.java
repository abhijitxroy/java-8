package stream.basics;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumOfAllNums {

    public static void main(String[] args) {
    Integer arr[]  = {1,2,3,4,5};		
    Supplier<Stream<Integer>> stream = () -> Arrays.asList(arr).stream();
    Integer sum = stream.get().collect(Collectors.summingInt(Integer::valueOf));
    System.out.println("Sum all numbers: " + sum);

    }
}