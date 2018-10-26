package com.itcsb.discovery.java8;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortTester {

	public void execute() {
		List<String> names1 = Helper.namesList;
		List<String> names2 = Helper.namesList;

		System.out.println("Sort using Java 7 syntax: ");
		sortUsingJava7(names1);
		System.out.println(names1);

		System.out.println("Sort using Java 8 syntax: ");
		sortUsingJava8(names2);
		System.out.println(names2);
	}

	// sort using java 7
	private void sortUsingJava7(List<String> names) {
		Collections.sort(names, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.compareTo(s2);
			}
		});
	}

	// sort using java 8
	private void sortUsingJava8(List<String> names) {
		Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
	}
}
