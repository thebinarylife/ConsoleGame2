package co.binarylife.consolegame.room;

import java.util.ArrayList;
import java.util.HashMap;

import co.binarylife.consolegame.item.Item;
import co.binarylife.consolegame.player.Player;

public abstract class Room {
	private final int ID;
	private String name, description;
	private ArrayList<Item> items;
	private HashMap<Direction, Room> connectingRooms;
	
	/**
	 * Creates Room
	 * @param id - numerical id of room
	 * @param name - name of room
	 * @param description - description of room
	 * @param items - items within the room
	 */
	public Room(int id, String name, String description, ArrayList<Item> items) {
		this.ID = id;
		this.name = name;
		this.description = description;
		this.items = items;
		this.connectingRooms = new HashMap<>();
		this.items = new ArrayList<>();
	}
	
	public void addConnectingRoom(Direction direction, Room room, boolean flag) {
		connectingRooms.put(direction, room);
		if(flag)
			return;
		
		switch(direction) {
			case WEST:
				room.addConnectingRoom(Direction.EAST, this, true);
			case NORTH:
				room.addConnectingRoom(Direction.SOUTH, this, true);
			case SOUTH:
				room.addConnectingRoom(Direction.NORTH, this, true);
			case EAST:
				room.addConnectingRoom(Direction.WEST, this, true);
				
		}
	}
	
	public void addItem(Item item) {
		items.add(item);
	}
	
	public int getId() {
		return ID;
	}
	
	public String getName() {
		return name;
	}
	
	public Room getConnectingRoom(Direction direction) {
		return connectingRooms.get(direction);
	}
	
	public String getDescription() {
		return description;
	}
	
	public ArrayList<Item> getItems() {
		return items;
	}
	
	public Item getItem(String name) {
		for(Item i : items)
			if(i.getName().equalsIgnoreCase(name))
				return i;
		
		return null;
	}
	
	public Item getItem(int id) {
		for(Item i : items)
			if(i.getId() == id)
				return i;
		
		return null;
	}
	
	public void removeItem(Item item) {
		items.remove(item);
	}
	
	public void sendRoomMessage(Player player) {
		player.sendMessage(name + " " + description);
	}
	
	public abstract void connectRooms();
	protected abstract void loadItems();
}
