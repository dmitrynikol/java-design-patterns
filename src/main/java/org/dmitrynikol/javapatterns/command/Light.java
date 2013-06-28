package main.java.org.dmitrynikol.javapatterns.command;

public class Light {
	private boolean indicator;
	
	public void switchOn() {
		indicator = true;
	}
	
	public void switchOff() {
		indicator = false;
	}
	
	public boolean isEnabled() {
		return indicator;
	}
}
