package co.binarylife.consolegame.command.commands;

import co.binarylife.consolegame.command.Command;
import co.binarylife.consolegame.item.Item;
import co.binarylife.consolegame.player.Player;
import co.binarylife.consolegame.util.Util;

public class DropItemCommand extends Command {
	
	public DropItemCommand() {
		super("drop", 1, "drop <slot>", "Drops item in given slot.");
	}
	
	@Override
	public boolean execute(String args[], Player player) {
		if(!Util.isInt(args[0])) {
			player.sendMessage(getSyntax());
			return false;
		}
		
		int slot = Integer.parseInt(args[0]) - 1;
		if(slot < 0 || slot > 5) {
			player.sendMessage(getSyntax());
			return false;
		}
		
		Item item = player.getInventory().getItem(slot);
		if(item == null) {
			player.sendMessage("There is no item in that slot!");
			return false;
		}
		
		player.getInventory().dropItem(item);
		player.sendMessage(item.getName() + " has been dropped!");
		return true;
	}

}
