package co.binarylife.consolegame.command.commands;

import co.binarylife.consolegame.command.Command;
import co.binarylife.consolegame.item.Item;
import co.binarylife.consolegame.player.Player;
import co.binarylife.consolegame.util.Util;

public class InspectCommand extends Command {

	public InspectCommand() {
		super("inspect", 1, "inspect <item>", "Displays the description of the item");
	}
	@Override
	public boolean execute(String[] args, Player player) {
		String itemString = Util.amend(args);
		Item item = player.getRoom().getItem(itemString);
		
		if(item == null) {
			player.sendMessage("That item is not in this room!");
			return false;
		}
		
		player.sendMessage(item.getDescription());
		return true;
	}

}
