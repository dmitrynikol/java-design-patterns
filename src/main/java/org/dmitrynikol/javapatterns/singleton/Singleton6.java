package main.java.org.dmitrynikol.javapatterns.singleton;

public enum Singleton6 {
	INSTANCE;
	
	private Singleton6() {
	}
	
	public static Singleton6 getInstance() {
		return INSTANCE;
	}
}