package main.java.org.dmitrynikol.javapatterns.command;

public class Main {
	public static void main(String[] args) {
		CommandManager manager = new CommandManager();
		Light light = new Light();
		
		manager.setCommand(new LightOn(light));
		manager.execute();
		System.out.println(light.isEnabled());
		
		manager.setCommand(new LightOff(light));
		manager.execute();
		System.out.println(light.isEnabled());
	}
}
