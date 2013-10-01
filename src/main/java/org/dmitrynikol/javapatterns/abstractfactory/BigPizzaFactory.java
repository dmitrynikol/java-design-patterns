package main.java.org.dmitrynikol.javapatterns.abstractfactory;


public class BigPizzaFactory {
	public static Pizza makePizza(Type type) {
		Pizza pizza = null;
		switch(type) {
			case ROUND:  new RoundPizza(Size.BIG);
			case SQUARE: new SquarePizza(Size.BIG);
			default: break;
		}
		return pizza;
	}
}
