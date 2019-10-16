package co.binarylife.consolegame.room;

import java.util.ArrayList;

import co.binarylife.consolegame.room.rooms.DemoRoom;
import co.binarylife.consolegame.room.rooms.StartingRoom;

public class RoomManager {
	private ArrayList<Room> rooms;
	
	public RoomManager() {
		this.rooms = new ArrayList<>();
	}
	
	public void initRooms() {
		rooms.add(new StartingRoom());
		rooms.add(new DemoRoom());
		
		for(Room r : rooms) {
			r.connectRooms();
			r.loadItems();
		}
	}
	
	public void addRoom(Room room) {
		rooms.add(room);
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
