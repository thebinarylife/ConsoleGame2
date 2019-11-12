package co.binarylife.consolegame.item.items;

import co.binarylife.consolegame.Game;
import co.binarylife.consolegame.item.Item;
import co.binarylife.consolegame.item.MovableItem;

public class Candle extends Item implements MovableItem {
	
	public Candle(CandleColor color) {
		super(Game.getItemManager().getNext(), 
				color.toString(), "A " + color.toString() + " candle. Looks like it can fit in something...");
	}

}
