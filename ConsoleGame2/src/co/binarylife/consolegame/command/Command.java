package co.binarylife.consolegame.command;

import co.binarylife.consolegame.player.Player;

public abstract class Command {
	private String name;
	private int argsLength;
	private String syntax;
	private String description;
	
	/**
	 * Create new command
	 * 
	 * @param name name of command
	 * @param argsLength least amount of arguments possible
	 * @param syntax usage (ex. "<cmd> [args]>")
	 * @param description description of command usage
	 */
	public Command(String name, int argsLength, String syntax, String description){
		this.name = name;
		this.argsLength = argsLength;
		this.syntax = syntax;
		this.description = description;
	}
	
	/**
	 * Get name of command
	 * @return name of command
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Get description of command
	 * @return description of command
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * Get command syntax
	 * @return syntax as string
	 */
	public String getSyntax() {
		return syntax;
	}
	
	/**
	 * Get least amount of arguments needed
	 * @return argument length
	 */
	public int getArgsLength() {
		return argsLength;
	}
	
	/**
	 * Method executed when command is called by player... Code defined in subclasses of the command class
	 * 
	 * @param args arguments from player
	 * @param player player that executed the command
	 * @return returns whether command was executed correctly
	 */
	public abstract boolean execute(String[] args, Player player);

}
