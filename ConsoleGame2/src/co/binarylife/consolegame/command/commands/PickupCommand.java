package co.binarylife.consolegame.command.commands;

import co.binarylife.consolegame.command.Command;
import co.binarylife.consolegame.item.Item;
import co.binarylife.consolegame.player.Player;
import co.binarylife.consolegame.util.Util;

public class PickupCommand extends Command {
	
	// COMMAND: pickup <name> <slot>
	public PickupCommand() {
		super("pickup", 2, "pickup <name> <slot>", "Pick up item from room");
	}
	
	@Override
	// cmd [args]
	public boolean execute(String[] args, Player player) {
		Item item = player.getRoom().getItem(args[0]);
		if(item == null) {
			player.sendMessage("That item is not in this room!");
			player.sendMessage(getSyntax());
			return false;
		}
		
		if(Util.isInt(args[1])) {
			player.sendMessage(getSyntax());
			return false;
		}
		
		if(player.getInventory().isFilled(Util.toInteger(args[1]))) {
			player.sendMessage(args[1] + " is already filled!");
			player.sendMessage(getSyntax());
			return false;
		}
		
		player.getInventory().pickupItem(item, Util.toInteger(args[1]));
		player.sendMessage(args[0] + " has been placed in slot " + args[1] + " of your inventory!");
		
		return true;
	}

}
