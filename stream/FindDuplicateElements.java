package stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicateElements {
    public static void main(String[] args) {
        Integer[] arr = { 11, 81, 18, 49, 111, 98, 98, 32, 11 };
        Map<Integer, Long> map = List.of(arr)
                                     .stream()
                                     .collect(Collectors.groupingBy( Integer::valueOf, Collectors.counting()));
        System.out.println(map);
    }
}
