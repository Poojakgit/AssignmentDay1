package collections.demo.arraylist;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) throws InterruptedException {
		List<String> arrayNames = new ArrayList<>();
		// Assigning Start time for Array List operations
		Instant arrayStartTime = Instant.now();

		// Adding 1000 Object in names array list
		for (int i = 0; i < 10000; i++) {
			arrayNames.add("names is " + i);
		}

		// Removing 500 elements from array list
		for (int i = 500; i >= 0; i--) {
			arrayNames.remove(i);
		}

		// Adding 1500 elements from array list
		for (int i = 0; i < 1500; i++) {
			arrayNames.add(i, "names is " + i);
		}
		
		Instant arrayEndTime = Instant.now();

		arrayNames.forEach(System.out::println);
		System.out.println("----------------------------------");

		System.out.println("ArrayList time duration: " + Duration.between(arrayStartTime, arrayEndTime));

		//Creating LinkedList 
		List<String> linkedNames = new LinkedList<>();
		//Assigning start time for linked list
		Instant linkedStartTime = Instant.now();
		for (int i = 0; i < 10000; i++) {
			linkedNames.add("names is " + i);
		}
		//Removing 500 elements from linked list
		for (int i = 500; i >= 0; i--) {
			linkedNames.remove(i);
		}

		//Adding 1500 elements in linked list
		for (int i = 0; i < 1500; i++) {
			linkedNames.add(i, "names is " + i);
		}
		Instant linkedEndTime = Instant.now();

		linkedNames.forEach(System.out::println);
		System.out.println("----------------------------------");

		System.out.println("LinkedList time duration: " + Duration.between(linkedStartTime, linkedEndTime));
	}

}
