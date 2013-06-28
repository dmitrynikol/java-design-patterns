package main.java.org.dmitrynikol.javapatterns.builder;

import main.java.org.dmitrynikol.javapatterns.builder.Nutrition.Taste;

public class Main {
	public static void main(String[] args) {
		Nutrition nutrition1 = new Nutrition.Builder(100, 500).build();
		System.out.println(nutrition1);
		
		Nutrition nutrition2 = new Nutrition.Builder(170, 800).fat(55).
				sodium(300).taste(Taste.SALTY).build();
		System.out.println(nutrition2);
	}
}
