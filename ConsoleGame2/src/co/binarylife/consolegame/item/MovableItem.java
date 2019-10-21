package co.binarylife.consolegame.item;

public abstract class MovableItem extends Item {
	
	public MovableItem(int id, String name) {
		super(id, name);
	}
	
	public abstract void pickup();
}
