package stream.basics;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindPrimeNumber {
    public static void main(String[] args) {
        // I need to have the range
        // For instance, 1 to 20

        List<Integer> primeList = IntStream.range(2, 20)
                                           .filter(e -> isPrime(e))
                                           .boxed()
                                           .collect(Collectors.toList());
        System.out.println("List of prime numbers : " + primeList);
        }

        private static boolean isPrime(int num) {
            if ((num > 1) && IntStream.range(2, num).noneMatch(e -> num % e == 0)) {
                return true;
            }
            return false;
        }
}
