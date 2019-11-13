package co.binarylife.consolegame.item.items;

import co.binarylife.consolegame.Game;
import co.binarylife.consolegame.item.Item;
import co.binarylife.consolegame.item.UnmovableItem;

public class Painting extends Item implements UnmovableItem {
	private CandleColor[] order;
	
	public Painting() {
		super(Game.getItemManager().getNext(), "Painting", "Theres an old faded painting of just colors...");
	}
	
	@Override
	public String getDescription() {
		String desc = super.getDescription() + " It looks like the colors are ";
		for(CandleColor c : order)
			desc += " " + c;
		
		return desc += ".";
	}
	
	
	public void setOrder(CandleColor[] order) {
		this.order = order;
	}

}
