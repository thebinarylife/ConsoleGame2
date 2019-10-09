package co.binarylife.consolegame;

import co.binarylife.consolegame.item.Item;

public class Inventory {
	private Item[] items;
	
	public Inventory()
	{
		items = new Item[12];
	}
	
	// Set item in slot "slot"
	public void setItem(int slot, Item item)
	{
		items[slot] = item;
	}
	
	public Item getItem(int slot)
	{
		return items[slot];
	}

}
