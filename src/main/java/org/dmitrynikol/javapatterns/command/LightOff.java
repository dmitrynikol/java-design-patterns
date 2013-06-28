package main.java.org.dmitrynikol.javapatterns.command;

public class LightOff implements Command {
	
	private Light light;
	
	public LightOff(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.switchOff();
	}
}
