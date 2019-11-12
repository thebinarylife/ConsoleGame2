package co.binarylife.consolegame.item.items;

import co.binarylife.consolegame.Game;
import co.binarylife.consolegame.item.Item;

public class Candle extends Item {
	
	public Candle(CandleColor color) {
		super(Game.getItemManager().getNext(), 
				color.toString(), "A " + color.toString() + " candle. Looks like it can fit in something...");
	}

}
