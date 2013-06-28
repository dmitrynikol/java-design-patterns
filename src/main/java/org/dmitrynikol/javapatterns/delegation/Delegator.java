package main.java.org.dmitrynikol.javapatterns.delegation;

public class Delegator {
	private Idelegation delegate;
	
	public void execute() {
		delegate.execute();
	}
	
	public void setDelegate(Idelegation delegate) {
		this.delegate = delegate;
	}
}
