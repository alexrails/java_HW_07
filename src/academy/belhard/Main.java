package academy.belhard;

import java.util.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	    Person p1 = new Person("Jhon", "Doe", Gender.MALE);
	    Person p2 = new Person("Alex", "Klark", Gender.MALE);
	    Person p3 = new Person("Barak", "Obama", Gender.MALE);
	    Person p4 = new Person("Jenifer", "Lopez", Gender.FEMALE);
	    Person p5 = new Person("Amanda", "Doe", Gender.FEMALE);

		ArrayList<Person> persons = new ArrayList<>(Arrays.asList(p1, p2, p3, p4, p5));
		outputCollection(persons);

		Person k1 = new Person("Jhon", "Doe", Gender.MALE);
		Person k2 = new Person("Jhon", "Doe", Gender.MALE);
		Person k3 = new Person("Barak", "Obama", Gender.MALE);
		Person k4 = new Person("Jenifer", "Lopez", Gender.FEMALE);
		Person k5 = new Person("Jenifer", "Lopez", Gender.FEMALE);

		Set<Person> people = new HashSet<>(Arrays.asList(k1, k2, k3, k4, k5));
		outputCollection(people);

		Map<Integer, Person> workers = new HashMap<Integer, Person>();
		workers.put(23, p1);
		workers.put(112, p2);
		workers.put(34, p3);
		workers.put(74, p4);
		workers.put(50, p5);
		outputCollection(workers);
    }
    public static void outputCollection(List<Person> list) {
		System.out.println("------------ArrayList task:");

		for(Person person : list) {
			System.out.println(person + " ");
		}
		System.out.println("Total number of elements is " + list.size());
	}
	public static void outputCollection(Set<Person> set) {
		System.out.println("------------HashSet task:");

		for (Person number : set) {
			System.out.println(number + " ");
		}
		System.out.println("Total number of elements is " + set.size());
	}
	public static void outputCollection(Map<Integer, Person> map) {
		System.out.println("------------Map task:");

		for (Map.Entry<Integer, Person> keyValuePair : map.entrySet()) {
			System.out.println(keyValuePair.getKey() + " - " + keyValuePair.getValue());
		}
		System.out.println("Total number of elements is " + map.size());
	}
}
