package stream.basics;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class SecondHighestNumber {
    public static void main(String[] args) {
        int[] arr = {5,9,11,2,8,21,1};
				
        Optional<Integer> secondHighest = Arrays.stream(arr)
                                                .boxed()
                                                .distinct()
                                                .sorted(Comparator.reverseOrder())
                                                .skip(1)
                                                .limit(1)
                                                .findFirst();
        if(secondHighest.isPresent()) {
            System.out.println(secondHighest.get());

        }
    }
}
