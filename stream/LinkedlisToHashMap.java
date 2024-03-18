package stream;

import java.util.LinkedList;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LinkedlisToHashMap {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("ab");
        ll.add("cd");
        ll.add("ef");
        ll.add("gh");

        Map<String, Object> map = ll.stream().collect(Collectors.toMap(Function.identity(), String::new));
        map.entrySet().stream().forEach(e -> System.out.println(e.getKey() + " = " + e.getValue()));

    }
}
