package co.binarylife.consolegame.item;

import java.util.ArrayList;
/**
 * Manages all items, for usage
 * 
 * @author tbl
 *
 */
public class ItemManager {
	private ArrayList<Item> items;
	
	/**
	 * Initializes item manager/loads items
	 */
	public ItemManager() {
		this.items = new ArrayList<>();
	}

	/**
	 * Adds specified item to manager
	 * 
	 * @param item item to be added
	 */
	public void addItem(Item item) {
		items.add(item);
	}
	
	/**
	 * Get Item by id
	 * 
	 * @param id id of item to be retrieved 
	 * @return item found by id... if NULL item was not found
	 */
	public Item getItem(int id) {
		for(Item i : items)
			if(i.getId() == id)
				return i;
		
		return null;
	}
	
	/**
	 * Get Item by name
	 * 
	 * @param name name of item to be retrieved 
	 * @return item found by name... if NULL item was not found
	 */
	public Item getItem(String name) {
		for(Item i : items)
			if(i.getName().equalsIgnoreCase(name))
				return i;
		
		return null;
	}
	
	/**
	 * Get all items
	 * 
	 * @return ArrayList of all items
	 */
	public ArrayList<Item> getItems(){
		return items;
	}
	
	public int getNext() {
		return items.size();
	}
}
