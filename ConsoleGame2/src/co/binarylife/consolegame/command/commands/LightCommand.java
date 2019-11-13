package co.binarylife.consolegame.command.commands;

import co.binarylife.consolegame.command.Command;
import co.binarylife.consolegame.item.Item;
import co.binarylife.consolegame.item.items.Candelabra;
import co.binarylife.consolegame.player.Player;
import co.binarylife.consolegame.util.Util;

public class LightCommand extends Command {
	
	public LightCommand() {
		super("light", 1, "light <item that can be lit>", "Light the specified item");
	}
	
	@Override
	public boolean execute(String[] args, Player player) {
		Item item = player.getRoom().getItem(Util.amend(args));
		if(item == null) {
			player.sendMessage("That item does not exist!");
			return false;
		}
		
		if(!(item instanceof Candelabra)) {
			player.sendMessage("That item cannot be lit!");
			return false;
		}
		
		Candelabra candelabra = (Candelabra) item;
		candelabra.lightCandles();
		
		return true;
	}

}
