package co.binarylife.consolegame.command.commands;

import co.binarylife.consolegame.command.Command;
import co.binarylife.consolegame.item.Item;
import co.binarylife.consolegame.player.Player;
import co.binarylife.consolegame.room.Room;

public class DemoCommand extends Command {
	
	public DemoCommand() {
		super("demo", 1);
	}
	
	public boolean execute(String[] args, Player player) {
		Room room = player.getRoom();
		
		Item item = room.getItem(args[0]);
		if(item == null)
			return false;
		
		player.getInventory().setItem(0, item);
		return true;
	}

}
