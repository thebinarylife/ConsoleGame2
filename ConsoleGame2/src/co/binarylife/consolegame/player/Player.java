package co.binarylife.consolegame.player;

import co.binarylife.consolegame.Game;
import co.binarylife.consolegame.room.Direction;
import co.binarylife.consolegame.room.Room;

public class Player {
	private String name;
	private Inventory inv;
	private Room currentRoom;
	
	// TODO Decide whether inventory should be created outside of player class or in player class
	public Player(String name) {
		inv = new Inventory(this);
		
		// TODO Set room
	}
	
	public String getName() {
		return name;
	}
	
	public Inventory getInventory() {
		return inv;
	}
	
	public void sendMessage(String message) {
		System.out.println(message);
	}
	
	public Room getRoom() {
		return currentRoom;
	}
	
	public Room setRoom(int id) {
		return setRoom(Game.getRoomManager().getRoom(id));
	}
	
	public Room setRoom(Room room) {
		return currentRoom = room;
	}
	
	public Room move(Direction direction) {
		return setRoom(currentRoom.getConnectingRoom(direction));
	}

}
