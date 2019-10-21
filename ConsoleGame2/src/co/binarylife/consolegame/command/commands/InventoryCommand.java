package co.binarylife.consolegame.command.commands;

import co.binarylife.consolegame.command.Command;
import co.binarylife.consolegame.item.Item;
import co.binarylife.consolegame.player.Inventory;
import co.binarylife.consolegame.player.Player;

public class InventoryCommand extends Command {
	
	public InventoryCommand() {
		super("inventory", 0, "inventory", "Lists all of the items in your inventory!");
	}
	
	@Override
	public boolean execute(String[] args, Player player) {
		Inventory inv = player.getInventory();
		
		player.sendMessage("Current inventory: ");
		int count = 1;
		for(Item i : inv.getItems()) {
			if(i == null)
				player.sendMessage("\tSlot " + count + ": " + "is empty!");
			else
				player.sendMessage("\tSlot " + count + ": " + i.getName());
		}
		
		return true;
	}

}
