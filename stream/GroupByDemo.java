package stream;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByDemo {
    	public static void main(String[] args) {
		Person p1 = new Person("Kosa", 21);
		Person p2 = new Person("Saosa", 21);
		Person p3 = new Person("Tia", 22);
		Person p4 = new Person("Komal", 22);
		Person p5 = new Person("Kanan", 25);
		Person p6 = new Person("Kanan", 25);
		Person p7 = new Person("Tia", 22);
		ArrayList<Person> list = new ArrayList<>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		list.add(p6);
		list.add(p7);

		// groupingBy
        //		Map<Object, List<Person>> list2 = list.stream().collect(Collectors.groupingBy(p -> p.getAge() == 22));
        //		System.out.println("grouping by age -> " + list2);
      
        //		list.stream()
        //		.collect(Collectors.groupingBy(Person::getName, Collectors.counting()))
        //		.entrySet()
        //		.stream()
        //		.filter(e -> e.getValue()>1)
        //		.collect(Collectors.toSet()).forEach(System.out::println);
		
		Map<String, Long> map = list.stream().collect(Collectors.groupingBy(Person::getName, Collectors.counting()));
		//System.out.println(map);
		map.entrySet().stream().map(e -> e).forEach(System.out::println);

	}

}

class Person{
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String toString() {
		return this.name;
	}

}
