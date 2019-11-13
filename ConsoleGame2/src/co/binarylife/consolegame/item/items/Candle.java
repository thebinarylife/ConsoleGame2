package co.binarylife.consolegame.item.items;

import co.binarylife.consolegame.Game;
import co.binarylife.consolegame.item.Item;
import co.binarylife.consolegame.item.MovableItem;
import co.binarylife.consolegame.item.PlaceableItem;

public class Candle extends Item implements MovableItem, PlaceableItem {
	private CandleColor color;
	
	public Candle(CandleColor color) {
		super(Game.getItemManager().getNext(), 
				color.toString(), "A " + color.toString() + " candle. Looks like it can fit in something...");
		
		this.color = color;
	}
	
	public CandleColor getColor() {
		return color;
	}
	
	public void setColor(CandleColor color) {
		this.color = color;
	}

}
