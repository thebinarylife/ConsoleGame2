package co.binarylife.consolegame.item;

import co.binarylife.consolegame.player.Player;

public abstract class Item {
	private int id;
	private String name;
	
	public Item(int id, String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	// Called everytime item is used
	public abstract void use(Player player);

}
