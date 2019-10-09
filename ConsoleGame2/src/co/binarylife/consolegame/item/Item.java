package co.binarylife.consolegame.item;

public class Item {
	private int id;
	private String name;
	
	public Item(int id, String name)
	{
		this.name = name;
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}

}
