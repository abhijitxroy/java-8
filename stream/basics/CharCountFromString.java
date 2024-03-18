package stream.basics;

import java.util.Map;
import java.util.stream.Collectors;

public class CharCountFromString {
    public static void main(String[] args) {
        String str = "abhijit";

        // using stream

        // char[] chArr = str.toCharArray();

        Map<Character, Long> map = str.chars().mapToObj(e -> (char)e).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        map.forEach((k,v) -> System.out.println(k + " = " + v));
    }
}
