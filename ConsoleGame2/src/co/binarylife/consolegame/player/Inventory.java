package co.binarylife.consolegame.player;

import co.binarylife.consolegame.Game;
import co.binarylife.consolegame.item.Item;

/**
 * Player inventory class.
 * 
 * @author tbl
 *
 */
public class Inventory {
	private Item[] inventory;
	private int currentSlot;

	private Player player;
	
	/**
	 * Creates inventory for specified player
	 * 
	 * @param player player for inventory object
	 */
	public Inventory(Player player) {
		inventory = new Item[12];
		this.player = player;
		currentSlot = 0;
	}
	
	/**
	 * Set item in given slot to specified item
	 * 
	 * @param slot slot which item will be placed
	 * @param item item to be placed in inventory
	 */
	public void setItem(int slot, Item item) {
		inventory[slot] = item;
	}

	/**
	 * Get item in specified slot
	 * 
	 * @param slot slot
	 * @return item in spot, null if no item is in specified slot
	 */
	public Item getItem(int slot) {
		return inventory[slot];
	}
	
	/**
	 * Drop item in specified slot
	 * 
	 * @param slot slot of item to be dropped
	 */
	public void dropItem(int slot) {
		player.getRoom().addItem(inventory[slot]);
		setItem(slot, null);
	}
	
	/**
	 * Pick up item from player's current room
	 * 
	 * @param item item to be picked up
	 * @param slot slot where item will be placed
	 */
	public void pickupItem(Item item, int slot) {
		player.getRoom().removeItem(item);
		setItem(slot, item);
		
	}

}
