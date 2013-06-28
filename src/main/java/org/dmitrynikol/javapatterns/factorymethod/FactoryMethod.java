package main.java.org.dmitrynikol.javapatterns.factorymethod;

public class FactoryMethod {
	private FactoryMethod() {
	}
	
	public static IFruit createFruit(FruitTypes type) {
		switch(type) {
			case APPLE: return new Apple();
			case PEAR: return new Pear();
			case PLUM: return new Plum();
			case CHERRY: return new Cherry();
			default: throw new IllegalArgumentException(
					"Not supported type of cell phone:" + type);
		}
	}
}
