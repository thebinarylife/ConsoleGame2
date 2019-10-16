package co.binarylife.consolegame.command.commands;

import co.binarylife.consolegame.command.Command;
import co.binarylife.consolegame.item.Item;
import co.binarylife.consolegame.player.Player;

public class DropItemCommand extends Command {
	
	public DropItemCommand() {
		super("drop", 1, "drop <slot>", "Drops item in given slot.");
	}
	
	@Override
	public boolean execute(String args[], Player player) {
		Item item = player.getInventory().getItem(Integer.parseInt(args[0]));
		
		if(item == null) {
			player.sendMessage("There is no item in that slot!");
			return false;
		}
		
		player.getInventory().dropItem(Integer.parseInt(args[0]));
		player.sendMessage(item.getName() + " has been dropped!");
		return true;
	}

}
