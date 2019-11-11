package co.binarylife.consolegame.room;

import java.util.ArrayList;

import co.binarylife.consolegame.room.rooms.BedroomHallway;
import co.binarylife.consolegame.room.rooms.GuestBedroom;
import co.binarylife.consolegame.room.rooms.MasterBedroom;

public class RoomManager {
	private ArrayList<Room> rooms;
	
	public RoomManager() {
		this.rooms = new ArrayList<>();
	}
	
	public void initRooms() {
		rooms.add(new GuestBedroom());
		rooms.add(new BedroomHallway());
		rooms.add(new MasterBedroom());
		
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
