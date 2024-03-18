package stream.basics;

import java.util.stream.Stream;

public class LongestString {
    public static void main(String[] args) {
        String[] arr = {"java", "technology", "springboot", "microservices"};
		
        String longestString = Stream.of(arr)
                                     .reduce((w1, w2) -> w1.length() > w2.length() ? w1 : w2)
                                     .get();
        System.out.println(longestString);

    }
}
