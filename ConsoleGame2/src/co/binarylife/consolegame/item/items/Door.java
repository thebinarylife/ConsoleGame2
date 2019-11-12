package co.binarylife.consolegame.item.items;

import co.binarylife.consolegame.Game;
import co.binarylife.consolegame.item.Item;
import co.binarylife.consolegame.item.UnmovableItem;

public class Door extends Item implements UnmovableItem {
	private boolean locked;
	private Key key;
	
	public Door(String name, Key key) {
		super(Game.getItemManager().getNext(), name, "");
		this.key = key;
		
		if(key != null)
			locked = true;
		else
			locked = false;
	}
	
	public Key getKey() {
		return key;
	}
	
	public boolean isLocked() {
		return locked;
	}
	
	public void unlock() {
		locked = false;
	}
	
	public void lock() {
		locked = true;
	}
	
	@Override
	public String getDescription() {
		String s;
		if(locked)
			s = "LOCKED";
		else
			s = "UNLOCKED";
		
		return super.getDescription() + s;
	}
	
}
