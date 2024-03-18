package stream;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapDemo {

    public static void main(String[] args) {
        Integer[][] array2d = { {2, 3, 5}, {7, 11, 13}, {17, 19, 23} };
		
		Integer[] intArr = Stream.of(array2d).flatMap(Stream::of).toArray(Integer[]::new);
		for( int i : intArr) {
			System.out.print(i + " ");
		}
        System.out.println();
        
		  // Alternative-1
		
		Arrays
            .stream(array2d)
            .flatMap(Stream::of)
            .collect(Collectors.toList())
			.forEach( e -> System.out.print(e + " "));
		System.out.println();
		// Alternative-2
		
		Arrays.asList(array2d).stream().flatMap(Stream::of).collect(Collectors.toList())
						.forEach( e -> System.out.print(e + " "));
        System.out.println();
		// Alternatove-3
		
		Arrays.asList(array2d).stream().flatMap( i -> Arrays.stream(i)).collect(Collectors.toList())
						.forEach( e -> System.out.print(e + " "));

    }
}
