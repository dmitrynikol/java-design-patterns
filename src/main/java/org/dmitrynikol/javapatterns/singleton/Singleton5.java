package main.java.org.dmitrynikol.javapatterns.singleton;

/**
 * Initialization on demand holder.
 */
public class Singleton5 {
	private Singleton5() {
	}
	
	private static class Action {
		private static Singleton5 instance = new Singleton5();
	}
	
	public static Singleton5 getInstance() {
		return Action.instance;
	}
}
