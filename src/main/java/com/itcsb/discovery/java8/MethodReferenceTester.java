package com.itcsb.discovery.java8;

import java.util.List;

public class MethodReferenceTester {

	public void execute() {
		List names = Helper.namesList;

		names.forEach(System.out::println);
	}

}
