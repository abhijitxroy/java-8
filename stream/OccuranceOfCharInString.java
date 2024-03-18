package stream;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * I/P: "AAAAABBCCAA"
 * O/P: 7A2B2C
 * 
 *  Convert the String in to a Stream
    Convert int into Character
    Group by Character and count occurrences
    For each entry add the key(Character) followed by the value(Occurrences)to the result
    using the joining collector
 */
public class OccuranceOfCharInString{

    public static void main(String[] args) {
        String str = "AAAAABBCCAA";
    
        String output = str
                        .chars()
                        .mapToObj(i->(char)i)
                        .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                        .entrySet()
                        .stream()
                        .flatMap(entry->Stream.of(entry.getValue().toString(),entry.getKey().toString()))
                        .collect(Collectors.joining());

        System.out.println(output); // O/P: 7A2B2C
    }
}
