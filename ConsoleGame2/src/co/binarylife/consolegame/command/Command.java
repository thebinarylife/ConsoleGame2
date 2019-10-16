package co.binarylife.consolegame.command;

import co.binarylife.consolegame.player.Player;

public abstract class Command {
	private String name;
	private int argsLength;
	private String syntax;
	private String description;
	
	// Name of command, length of arguments
	public Command(String name, int argsLength, String syntax, String description){
		this.name = name;
		this.argsLength = argsLength;
		this.syntax = syntax;
		this.description = description;
	}
	
	// Get the name of the command
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public String getSyntax() {
		return syntax;
	}
	
	// Get length of arguments
	public int getArgsLength() {
		return argsLength;
	}
	
	// Called when command is ran by player
	public abstract boolean execute(String[] args, Player player);

}
