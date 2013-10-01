package main.java.org.dmitrynikol.javapatterns.abstractfactory;

public class RoundPizza extends Pizza {

	public RoundPizza(Size size) {
		super(Type.ROUND, size);
		make();
	}

	@Override
	protected void make() {
		System.out.println("Creating round pizza...");
	}
}
