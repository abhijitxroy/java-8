package stream.basics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ElementStartWith1 {
    public static void main(String[] args) {
        int[] arr = { 5, 9, 11, 2, 8, 21, 1 };
        List<String> list =  Arrays.stream(arr)
                                   .boxed()
                                   .map(e -> e + "")
                                   .filter(e -> e.startsWith("1"))
                                   .collect(Collectors.toList());			
        System.out.println(list);

    }
}
