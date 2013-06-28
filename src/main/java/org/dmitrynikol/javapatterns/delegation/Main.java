package main.java.org.dmitrynikol.javapatterns.delegation;

public class Main {
	public static void main(String[] args) {
		Delegator delegator = new Delegator();
		
		FirstDelegate firstDelegate = new FirstDelegate();
		delegator.setDelegate(firstDelegate);
		delegator.execute();
		
		Idelegation secondDelegate = new SecondDelegate();
		delegator.setDelegate(secondDelegate);
		delegator.execute();
	}
}
