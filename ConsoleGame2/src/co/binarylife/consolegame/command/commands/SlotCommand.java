package co.binarylife.consolegame.command.commands;

import co.binarylife.consolegame.command.Command;
import co.binarylife.consolegame.item.Item;
import co.binarylife.consolegame.player.Player;
import co.binarylife.consolegame.util.Util;

public class SlotCommand extends Command {
	
	public SlotCommand() {
		super("slot", 1, "slot <slot number>", "Shows the item in given slot");
	}
	
	@Override
	public boolean execute(String[] args, Player player) {
		if(!Util.isInt(args[0])) {
			player.sendMessage(getSyntax());
			return false;
		}
		
		int i = Util.toInteger(args[0]);
		Item item = player.getInventory().getItem(i);
		if(item == null)
			player.sendMessage("That slot is empty!");
		else
			player.sendMessage("Slot " + i + " has " + item.getName() + " in it.");
		
		return true;
	}
}
