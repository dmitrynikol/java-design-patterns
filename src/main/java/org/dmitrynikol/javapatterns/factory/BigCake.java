package main.java.org.dmitrynikol.javapatterns.factory;

public class BigCake extends Cake {
	
	public BigCake() {
		super(CakeType.BIG);
		make();
	}

	@Override
	protected void make() {
		System.out.println("Creating big cake...");
	}
}
