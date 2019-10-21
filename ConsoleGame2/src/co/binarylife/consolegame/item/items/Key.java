package co.binarylife.consolegame.item.items;

import co.binarylife.consolegame.item.Item;
import co.binarylife.consolegame.item.MovableItem;

public class Key extends Item implements MovableItem {
	
	public Key(int id, String name) {
		super(id, name);
	}
	
	@Override
	public void pickup() {
		
	}
}
