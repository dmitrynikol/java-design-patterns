package main.java.org.dmitrynikol.javapatterns.delegation;

public class SecondDelegate implements Idelegation {

	@Override
	public void execute() {
		System.out.println(getClass());
	}
}

