package co.binarylife.consolegame.command.commands;

import co.binarylife.consolegame.command.Command;
import co.binarylife.consolegame.player.Player;

public class SortCommand extends Command {
	
	public SortCommand() {
		super("sort", 1, "sort <item> <color one> <color two> <color three> <color four>", "Sort ");
	}
	
	@Override
	public boolean execute(String[] args, Player player) {
		
		
		return true;
	}

}
