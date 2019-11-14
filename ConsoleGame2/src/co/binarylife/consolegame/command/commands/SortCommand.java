package co.binarylife.consolegame.command.commands;

import co.binarylife.consolegame.command.Command;
import co.binarylife.consolegame.item.Item;
import co.binarylife.consolegame.item.items.Candelabra;
import co.binarylife.consolegame.item.items.CandleColor;
import co.binarylife.consolegame.player.Player;
import co.binarylife.consolegame.util.Util;

public class SortCommand extends Command {
	
	public SortCommand() {
		super("sort", 1, "sort <color one> <color two> <color three> <color four> <item>", "Sort ");
	}
	
	@Override
	public boolean execute(String[] args, Player player) {
		CandleColor[] colors = new CandleColor[4];
		for(int i = 0; i < 4; i++) {
			colors[i] = CandleColor.toColor(args[i]);
		}
		
		boolean invalidFlag = false;
		for(CandleColor c : colors) {
			if(c == null)
				invalidFlag = true;
		}
		
		if(invalidFlag) {
			player.sendMessage("Colors: RED, WHITE, GOLD, BLACK");
			return false;
		}
		
		args[0] = null;
		args[1] = null;
		args[2] = null;
		args[3] = null;
		
		String itemString = Util.amend(args);
		if(itemString == null) {
			player.sendMessage(getSyntax());
			return false;
		}
		
		Item item = player.getRoom().getItem(itemString);
		if(item == null) {
			player.sendMessage("That item does not exist!");
			return false;
		}
		
		if(!(item instanceof Candelabra)) {
			player.sendMessage("This item cannot be sorted!");
			return false;
		}
		
		Candelabra candelabra = (Candelabra) item;
		if(candelabra.getCandles().length != 4) {
			player.sendMessage("A candle is missing!");
			return false;
		}
		
		candelabra.setCandleOrder(colors);
		
		player.sendMessage("The candles are now arranged in the following order:");
		for(CandleColor c : colors)
			player.sendMessage("\t" + c.toString());
		
		player.sendMessage("");
		
		return true;
	}

}

// red black gold white
