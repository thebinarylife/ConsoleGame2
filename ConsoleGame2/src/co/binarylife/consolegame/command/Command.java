package co.binarylife.consolegame.command;

import co.binarylife.consolegame.player.Player;

public abstract class Command {
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
	
	// Called when command is ran by player
	public abstract boolean execute(String[] args, Player player);

}
