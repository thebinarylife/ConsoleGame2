package co.binarylife.consolegame.item;

// ABSTRACT MEANS this is a SUPERCLASS where all sub items must implement their undefined methods
public abstract class UnmovableItem extends Item {
	
	public UnmovableItem(int id, String name)	{
		super(id, name);
	}
	
	public abstract void interactAlert();
	public abstract void loadCommands();
}
