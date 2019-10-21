package co.binarylife.consolegame.item;

/**
 * Item class, all items inherit this object
 * 
 * @author tbl
 *
 */
public abstract class Item {
	private int id;
	private String name;
	
	/**
	 * Creates new Item object
	 * 
	 * @param id id of item (starts at 0)
	 * @param name name of item
	 */
	public Item(int id, String name) {
		this.name = name;
	}
	
	/**
	 * Get id of item
	 * 
	 * @return id of item
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * Get name of item
	 * 
	 * @return name of item
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Called when item is used. can be a command, when automatically used... any instance
	 * @param player player using the item
	 */
//	public abstract void use(Player player);

}
