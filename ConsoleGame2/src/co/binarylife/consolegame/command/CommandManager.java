package co.binarylife.consolegame.command;

import java.util.ArrayList;

public class CommandManager {
	public ArrayList<Command> commands;
	
	public CommandManager()
	{
		commands = new ArrayList<>();
		
		// TODO Add commands
		commands.add(null);
	}
	
	public void addCommand(Command command)
	{
		commands.add(command);
	}

}
