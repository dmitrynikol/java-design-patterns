package main.java.org.dmitrynikol.javapatterns.factory;

public class SmallCake extends Cake {
	
	public SmallCake() {
		super(CakeType.SMALL);
		make();
	}

	@Override
	protected void make() {
		System.out.println("Creating small cake...");
	}
}
