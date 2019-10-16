package co.binarylife.consolegame.room;

import java.util.ArrayList;

public class RoomManager {
	private ArrayList<Room> rooms;
	
	public RoomManager() {
		this.rooms = new ArrayList<>();
	}
	
	public Room getRoom(int id) {
		for(Room r : rooms)
			if(r.getId() == id)
				return r;
		
		return null;
	}
	
	public Room getRoom(String name) {
		for(Room r : rooms)
			if(r.getName().equalsIgnoreCase(name))
				return r;
		
		return null;
	}
	
	public ArrayList<Room> getRooms() {
		return rooms;
	}
	
}
