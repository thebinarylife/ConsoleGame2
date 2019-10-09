package co.binarylife.consolegame.command;

import java.util.ArrayList;

public class CommandManager {
	public ArrayList<Command> commands;
	
	// Initialize manager
	public CommandManager()
	{
		commands = new ArrayList<>();
		
		// TODO Add commands
		commands.add(null);
	}
	
	// Add command to manager
	public void addCommand(Command command)
	{
		commands.add(command);
	}

}
