package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionByDemo {
    	public static void main(String[] args) {
		Person p1 = new Person("Abhijit", 21);
		Person p2 = new Person("Som", 21);
		Person p3 = new Person("Roy", 22);
		Person p4 = new Person("Tony", 22);
		Person p5 = new Person("Oliver", 25);
		Person p6 = new Person("Thanos", 25);
		Person p7 = new Person("Thor", 22);
		ArrayList<Person> list = new ArrayList<>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		list.add(p6);
		list.add(p7);

		// partitioningBy
		Map<Boolean, List<Person>> list3  = list.stream().collect(Collectors.partitioningBy(p -> p.getAge() == 22));
		System.out.println("partitioning by age -> " + list3);

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
