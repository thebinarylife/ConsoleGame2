package co.binarylife.consolegame.command.commands;

import co.binarylife.consolegame.command.Command;
import co.binarylife.consolegame.item.Item;
import co.binarylife.consolegame.player.Player;

public class DropItemCommand extends Command {
	
	public DropItemCommand() {
		super("drop", 1);
	}
	
	@Override
	public boolean execute(String args[], Player player) {
		Item item = player.getInventory().getItem(Integer.parseInt(args[0]));
		
		if(item == null)
			return false;
		
		player.getInventory().dropItem(player.getRoom().getId());
		return true;
	}

}
