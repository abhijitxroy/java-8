package stream;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Find first non-repeat element from a given String
 */
public class FirstNonRepeatElement {

    public static void main(String[] args) {
        String str = "ilovejavacoding";
		
        // Stream<String> stream1 = Arrays.stream(str.split(""));
                
        Entry <String, Long> firstNonRepeatElement  = Arrays
                    .stream(str.split(""))
                    .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                    .entrySet()
                    .stream()
                    .filter(e -> e.getValue() == 1)
                    .findFirst().get();
        System.out.println(firstNonRepeatElement);

    }
}