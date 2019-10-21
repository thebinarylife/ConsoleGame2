package co.binarylife.consolegame.item;

/**
 * Identifying interface that allows us to understand if the item can be moved or not
 * syntax: (item) instanceof MovableItem
 * 
 * All moveable objects IMPLEMENT this class
 * @author tbl
 *
 */
public interface MovableItem {
	public abstract void pickup();
}
