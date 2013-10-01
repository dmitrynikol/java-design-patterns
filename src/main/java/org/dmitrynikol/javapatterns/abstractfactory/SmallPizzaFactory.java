package main.java.org.dmitrynikol.javapatterns.abstractfactory;

public class SmallPizzaFactory {
	public static Pizza makePizza(Type type) {
		Pizza pizza = null;
		switch(type) {
			case ROUND:  new RoundPizza(Size.SMALL);
			case SQUARE: new SquarePizza(Size.SMALL);
			default: break;
		}
		return pizza;
	}
}
