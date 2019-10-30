package co.binarylife.consolegame.command;

import java.util.ArrayList;

import co.binarylife.consolegame.command.commands.DemoCommand;
import co.binarylife.consolegame.command.commands.DropItemCommand;
import co.binarylife.consolegame.command.commands.InspectCommand;
import co.binarylife.consolegame.command.commands.InventoryCommand;
import co.binarylife.consolegame.command.commands.ListCommand;
import co.binarylife.consolegame.command.commands.MapCommand;
import co.binarylife.consolegame.command.commands.MoveCommand;
import co.binarylife.consolegame.command.commands.PickupCommand;
import co.binarylife.consolegame.command.commands.SlotCommand;
import co.binarylife.consolegame.command.commands.UnlockCommand;

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
		commands.add(new InspectCommand());
		commands.add(new InventoryCommand());
		commands.add(new MapCommand());
		commands.add(new PickupCommand());
		commands.add(new SlotCommand());
		commands.add(new UnlockCommand());
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
