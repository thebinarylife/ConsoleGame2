package co.binarylife.consolegame.room;

import java.util.ArrayList;

import co.binarylife.consolegame.room.rooms.BedroomHallway;
import co.binarylife.consolegame.room.rooms.DiningRoom;
import co.binarylife.consolegame.room.rooms.GuestBathroom;
import co.binarylife.consolegame.room.rooms.GuestBedroom;
import co.binarylife.consolegame.room.rooms.Kitchen;
import co.binarylife.consolegame.room.rooms.Library;
import co.binarylife.consolegame.room.rooms.LivingRoom;
import co.binarylife.consolegame.room.rooms.MainHall;
import co.binarylife.consolegame.room.rooms.MasterBathroom;
import co.binarylife.consolegame.room.rooms.MasterBedroom;

public class RoomManager {
	private ArrayList<Room> rooms;
	
	public RoomManager() {
		this.rooms = new ArrayList<>();
	}
	
	public void initRooms() {
		rooms.add(new GuestBedroom());
		rooms.add(new GuestBathroom());
		rooms.add(new BedroomHallway());
		rooms.add(new MasterBedroom());
		rooms.add(new MasterBathroom());
		rooms.add(new LivingRoom());
		rooms.add(new MainHall());
		rooms.add(new Library());
		rooms.add(new DiningRoom());
		rooms.add(new Kitchen());
		
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
