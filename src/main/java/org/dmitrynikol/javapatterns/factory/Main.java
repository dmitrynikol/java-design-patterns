package main.java.org.dmitrynikol.javapatterns.factory;

public class Main {
	public static void main(String[] args) {
		System.out.println(CakeFactory.buildCake(CakeType.SMALL));
		System.out.println(CakeFactory.buildCake(CakeType.MEDIUM));
		System.out.println(CakeFactory.buildCake(CakeType.BIG));
	}
}
