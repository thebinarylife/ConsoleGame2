package co.binarylife.consolegame.item;

import java.util.ArrayList;

import co.binarylife.consolegame.item.items.DemoItem;

public class ItemManager {
	private ArrayList<Item> items;
	
	
	public ItemManager() {
		this.items = new ArrayList<>();
		initItems();
	}
	
	private void initItems() {
		items.add(new DemoItem());
	}
	
	public void addItem(Item item) {
		items.add(item);
	}
	
	public Item getItem(int id) {
		for(Item i : items)
			if(i.getId() == id)
				return i;
		
		return null;
	}
	
	public Item getItem(String name) {
		for(Item i : items)
			if(i.getName().equalsIgnoreCase(name))
				return i;
		
		return null;
	}
	
	public ArrayList<Item> getItems(){
		return items;
	}
}
