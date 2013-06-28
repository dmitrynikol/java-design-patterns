package main.java.org.dmitrynikol.javapatterns.factorymethod;

public class Main {
	public static void main(String[] args) {
		for (FruitTypes fruit : FruitTypes.values()) {
			System.out.println(FactoryMethod.createFruit(fruit).getClass());
		}
	}
}
