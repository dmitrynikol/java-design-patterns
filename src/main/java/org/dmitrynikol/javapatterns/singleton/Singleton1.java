package main.java.org.dmitrynikol.javapatterns.singleton;

/**
 * Singleton pattern: single class - single responsibility!
 */
public class Singleton1 {
	private static Singleton1 instance = new Singleton1();

	/** Don't let anyone else instantiate this class */
	private Singleton1() {
	}

	public static Singleton1 getInstance() {
		return instance;
	}
}
