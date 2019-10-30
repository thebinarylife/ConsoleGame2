package co.binarylife.consolegame.item.items;

import co.binarylife.consolegame.item.Item;
import co.binarylife.consolegame.item.UnmovableItem;

public class Door extends Item implements UnmovableItem {
	private boolean locked;
	private Key key;
	
	public Door(int id, String name, Key key) {
		super(id, name, "");
		this.key = key;
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
			s = "LOCKED\n";
		else
			s = "UNLOCKED\n";
		
		return getDescription() + s;
	}
	
}
