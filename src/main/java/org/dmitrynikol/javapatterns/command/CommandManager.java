package main.java.org.dmitrynikol.javapatterns.command;

public class CommandManager {
	
	private Command command;
	
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void execute() {
		command.execute();
	}
}
