package main.java.org.dmitrynikol.javapatterns.abstractfactory;

public class SquarePizza extends Pizza {

	public SquarePizza(Size size) {
		super(Type.SQUARE, size);
		make();
	}

	@Override
	protected void make() {
		System.out.println("Creating square pizza...");
	}
}
