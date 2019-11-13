package co.binarylife.consolegame.command.commands;

import co.binarylife.consolegame.command.Command;
import co.binarylife.consolegame.item.HolderItem;
import co.binarylife.consolegame.item.Item;
import co.binarylife.consolegame.item.PlaceableItem;
import co.binarylife.consolegame.player.Player;
import co.binarylife.consolegame.util.Util;

public class PlaceCommand extends Command {

	public PlaceCommand() {
		super("place", 1, "place <slot> <item>", "Place item from specified slot in specified item.");
	}
	
	@Override
	public boolean execute(String[] args, Player player) {
		if(!Util.isInt(args[0])) {
			player.sendMessage(getSyntax());
			return false;
		}
		
		int i = Util.toInteger(args[0]);
		Item slotItem = player.getInventory().getItem(i);
		if(slotItem == null) {
			player.sendMessage("There is no item in that slot!");
			return false;
		}
		
		if(!(slotItem instanceof PlaceableItem)) {
			player.sendMessage("This item cannot be placed!");
			return false;
		}
		
		args[0] = null;
		Item item = player.getRoom().getItem(Util.amend(args));
		if(item == null) {
			player.sendMessage("That item does not exist!");
			return false;
		}
		
		if(!(item instanceof HolderItem)) {
			player.sendMessage("That item cannot have something placed in it!");
			return false;
		}
		
		
		
		return true;
	}

}
