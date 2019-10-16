package co.binarylife.consolegame.player;

import co.binarylife.consolegame.Game;
import co.binarylife.consolegame.item.Item;

public class Inventory {
	private Item[] inventory;
	private int currentSlot;
	
	private Player player;
	
	public Inventory(Player player) {
		inventory = new Item[12];
		this.player = player;
		currentSlot = 0;
	}
	
	// Set item in slot "slot"
	public void setItem(int slot, Item item) {
		inventory[slot] = item;
	}

	public Item getItem(int slot) {
		return inventory[slot];
	}
	
	public void dropItem(int slot, int roomId) {
		Game.getRoomManager().getRoom(roomId).addItem(inventory[slot]);
		setItem(slot, null);
	}
	
	// TODO Decide whether room should handle differentiating item or if the inventory should
	public void pickupItem(int slot, int roomId, Item item) {
//		Game.rm.getRoom(room)
	}

}
