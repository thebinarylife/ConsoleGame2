package co.binarylife.consolegame.command;

public class Command {
	private String name;
	private int argsLength;
	
	// Name of command, length of arguments
	public Command(String name, int argsLength) {
		this.name = name;
		this.argsLength = argsLength;
	}
	
	// Get the name of the command
	public String getName() {
		return name;
	}
	
	// Get length of arguments
	public int getArgsLength() {
		return argsLength;
	}

}
