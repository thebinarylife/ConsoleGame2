package co.binarylife.consolegame.command;

import java.util.ArrayList;

import co.binarylife.consolegame.command.commands.DemoCommand;
import co.binarylife.consolegame.command.commands.DropItemCommand;
import co.binarylife.consolegame.command.commands.ListCommand;
import co.binarylife.consolegame.command.commands.MoveCommand;

public class CommandManager {
	public ArrayList<Command> commands;
	
	// Initialize manager
	public CommandManager() {
		commands = new ArrayList<>();
		initCommands();
		
		// TODO Add commands
		commands.add(null);
	}
	
	private void initCommands() {
		commands.add(new DemoCommand());
		commands.add(new DropItemCommand());
		commands.add(new MoveCommand());
		commands.add(new ListCommand());
	}
	
	// Add command to manager
	public void addCommand(Command command) {
		commands.add(command);
	}
	
	public Command getCommand(String cmd)
	{
		for(Command c : commands)
			if(c.getName().equalsIgnoreCase(cmd))
				return c;
		
		return null;
	}
	
	public void removeCommand(Command command) {
		commands.remove(command);
	}

}
