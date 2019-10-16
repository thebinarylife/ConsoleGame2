package co.binarylife.consolegame.command.commands;

import java.util.ArrayList;

import co.binarylife.consolegame.command.Command;
import co.binarylife.consolegame.item.Item;
import co.binarylife.consolegame.player.Player;

public class ListCommand extends Command{

	public ListCommand() {
		super("list", 0, "list", "Lists all items in current room."); 
	}

	@Override
	public boolean execute(String[] args, Player player) {
		ArrayList<Item> items = player.getRoom().getItems();
		
		player.sendMessage("Items in room" + player.getRoom().getName());
		for(Item i : items)
			player.sendMessage(i.getName());
		
		return false;
	}
}
