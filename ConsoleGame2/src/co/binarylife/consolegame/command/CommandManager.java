package co.binarylife.consolegame.command;

import java.util.ArrayList;

import co.binarylife.consolegame.command.commands.DemoCommand;
import co.binarylife.consolegame.command.commands.DropItemCommand;
import co.binarylife.consolegame.command.commands.ListCommand;
import co.binarylife.consolegame.command.commands.MoveCommand;

public class CommandManager {
	public ArrayList<Command> commands;
	
	/**
	 * Initializes manager... 
	 * initializes commands.
	 */
	public CommandManager() {
		commands = new ArrayList<>();
		initCommands();
	}
	
	/**
	 * Adds all commands to command ArrayList
	 */
	private void initCommands() {
		commands.add(new DemoCommand());
		commands.add(new DropItemCommand());
		commands.add(new MoveCommand());
		commands.add(new ListCommand());
	}
	
	/**
	 * Adds command to command manager
	 * 
	 * @param command command to be added
	 */
	public void addCommand(Command command) {
		commands.add(command);
	}
	
	/**
	 * Sorts through commands, until a command with specified name is found
	 * 
	 * @param cmd name of command
	 * @return Command object with specified name, if no command is found, returns null
	 */
	public Command getCommand(String cmd)
	{
		for(Command c : commands)
			if(c.getName().equalsIgnoreCase(cmd))
				return c;
		
		return null;
	}
	
	/**
	 * Remove command from command manager
	 * 
	 * @param command command to be removed from manager
	 */
	public void removeCommand(Command command) {
		commands.remove(command);
	}

}
