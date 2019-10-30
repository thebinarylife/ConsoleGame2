package co.binarylife.consolegame.room;

import java.util.ArrayList;
import java.util.HashMap;

import co.binarylife.consolegame.Game;
import co.binarylife.consolegame.item.Item;
import co.binarylife.consolegame.item.items.Door;
import co.binarylife.consolegame.player.Player;

/**
 * Room class, Inherited by all rooms
 * 
 * @author tbl
 *
 */
public abstract class Room {
	private final int ID;
	private String name, description;
	private ArrayList<Item> items;
	private HashMap<Direction, Room> connectingRooms;
	private HashMap<Direction, Door> doors;
	
	/**
	 * Creates Room
	 * @param id numerical id of room
	 * @param name name of room
	 * @param description description of room
	 * @param items items within the room
	 */
	public Room(int id, String name, String description) {
		this.ID = id;
		this.name = name;
		this.description = description;
		this.items = items;
		this.connectingRooms = new HashMap<>();
		this.items = new ArrayList<>();
		this.doors = new HashMap<>();
	}
	
	/**
	 * Adds a connection between two rooms. CONNECTION IS CREATED FOR BOTH ROOMS. If called in one room class, the other need not call the method.
	 * 
	 * @param direction direction of the room to be connected
	 * @param room room to be connected
	 * @param door specifies door between connected rooms
	 * @param flag false if being called outside the room class... do not put true
	 */
	public void addConnectingRoom(Direction direction, Room room, Door door, boolean flag) {
		connectingRooms.put(direction, room);
		doors.put(direction, door);
		
		if(flag)
			return;
		
		switch(direction) {
			case WEST:
				room.addConnectingRoom(Direction.EAST, this, door, true);
				break;
			case NORTH:
				room.addConnectingRoom(Direction.SOUTH, this, door, true);
				break;
			case SOUTH:
				room.addConnectingRoom(Direction.NORTH, this, door, true);
				break;
			case EAST:
				room.addConnectingRoom(Direction.WEST, this, door, true);
				break;
				
		}
	}
	
	/**
	 * Adds an item to the room
	 * 
	 * @param item item to be added
	 */
	public void addItem(Item item) {
		items.add(item);
		System.out.println(item.getName());
	}
	
	/**
	 * Gets id of room
	 * 
	 * @return id or room
	 */
	public int getId() {
		return ID;
	}
	
	/**
	 * Gets name of room
	 * 
	 * @return name of room
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Gets connecting room in specified of direction
	 * 
	 * @param direction direction of connected room
	 * @return room in specified direction... NULL if room does not exist
	 */
	public Room getConnectingRoom(Direction direction) {
		return connectingRooms.get(direction);
	}
	
	/**
	 * Gets description of room
	 * 
	 * @return description of room
	 */
	public String getDescription() {
		return description;
	}
	
	public Door getDoor(Direction direction) {
		return doors.get(direction);
	}
	
	public HashMap<Direction, Door> getDoors() {
		return doors;
	}
	
	/**
	 * Gets items in room
	 * 
	 * @return all items in the room as an ArrayList
	 */
	public ArrayList<Item> getItems() {
		return items;
	}
	
	/**
	 * Gets item in room by specified name
	 * 
	 * @param name name of item
	 * @return item, NULL if not found
	 */
	public Item getItem(String name) {
		for(Item i : items) {
			if(i == null)
				continue;
			
			if(i.getName().equalsIgnoreCase(name))
				return i;
		}
		
		return null;
	}
	
	/**
	 * Gets item in room by id
	 * 
	 * @param id id of item
	 * @return item found, NULL if not found
	 */
	public Item getItem(int id) {
		for(Item i : items)
			if(i.getId() == id)
				return i;
		
		return null;
	}
	
	/**
	 * Removes item from room
	 * 
	 * @param item item to be removed
	 */
	public void removeItem(Item item) {
		items.remove(item);
	}
	
	/**
	 * Sends message name and description to player
	 * 
	 * @param player player to receive the message
	 */
	public void sendRoomMessage(Player player) {
		player.sendMessage(name + " " + description);
	}
	
	/**
	 * Method to be implemented by all subclasses. Connects adjacent rooms.
	 */
	public abstract void connectRooms();
	
	/**
	 * Method to be implemented to load all items in room, ran by subclasses.
	 */
	protected abstract void loadItems();
}
