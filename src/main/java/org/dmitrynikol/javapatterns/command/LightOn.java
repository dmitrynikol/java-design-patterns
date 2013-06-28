package main.java.org.dmitrynikol.javapatterns.command;

public class LightOn implements Command {
	
	private Light light;

	public LightOn(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		light.switchOn();
	}
}
