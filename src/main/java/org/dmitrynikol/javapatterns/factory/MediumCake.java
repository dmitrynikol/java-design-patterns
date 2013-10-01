package main.java.org.dmitrynikol.javapatterns.factory;

public class MediumCake extends Cake {
	
	public MediumCake() {
		super(CakeType.MEDIUM);
		make();
	}

	@Override
	protected void make() {
		System.out.println("Creating medium cake...");
	}
}
