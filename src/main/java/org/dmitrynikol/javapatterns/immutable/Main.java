package main.java.org.dmitrynikol.javapatterns.immutable;

import java.util.Date;

public class Main {
	public static void main(String[] args) {
		System.out.println("Before");
		Immutable immutable = Immutable.createInstance(12345, "second", new Date());
		System.out.println(immutable.getFirst());
		System.out.println(immutable.getSecond());
		System.out.println(immutable.getThird());
		
		Date date = immutable.getThird();
		date.setYear(2050);
		System.out.println("After");
		System.out.println(immutable.getFirst());
		System.out.println(immutable.getSecond());
		System.out.println(immutable.getThird());
	}
}
