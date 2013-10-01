package main.java.org.dmitrynikol.javapatterns.abstractfactory;


/**
 * Factory pattern should use if you need some level 
 * of abstraction over a group of factories.
 */
public class PizzaFactory {
	
	private PizzaFactory() {}
	
	public static Pizza makePizza(Type type) {
		Pizza pizza = null;
		Size size = Size.BIG; // just stub, read parameter from somewhere
		switch(size) {
			case SMALL: pizza = SmallPizzaFactory.makePizza(type); break;
			case BIG: pizza = BigPizzaFactory.makePizza(type); break;
			default:
				pizza = SmallPizzaFactory.makePizza(type);
		}
		
		return pizza;
	}
}
