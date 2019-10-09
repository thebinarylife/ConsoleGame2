package co.binarylife.consolegame.rooms;

import java.util.HashMap;

import co.binarylife.consolegame.item.Item;

public class Room {
	private final int ID;
	private String name, description;
	private Item[] items;
	private HashMap<Direction, Room> connectingRooms;
	
	/**
	 * Creates Room
	 * @param id - numerical id of room
	 * @param name - name of room
	 * @param description - description of room
	 * @param items - items within the room
	 */
	public Room(int id, String name, String description, Item[] items)
	{
		this.ID = id;
		this.name = name;
		this.description = description;
		this.items = items;
		this.connectingRooms = new HashMap<>();
	}
	
	public void addConnectingRoom(Direction direction, Room room)
	{
		connectingRooms.put(direction, room);
	}
	
	public int getId()
	{
		return ID;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public Item[] getItems()
	{
		return items;
	}
	
	public Item getItem(String name)
	{
		for(Item i : items)
			if(i.getName().equalsIgnoreCase(name))
				return i;
		
		return null;
	}
	
	public Item getItem(int id)
	{
		for(Item i : items)
			if(i.getId() == id)
				return i;
		
		return null;
	}

}
