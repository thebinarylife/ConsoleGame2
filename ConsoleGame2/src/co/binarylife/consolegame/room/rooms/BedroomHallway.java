package co.binarylife.consolegame.room.rooms;


import co.binarylife.consolegame.Game;

import co.binarylife.consolegame.item.items.Door;
import co.binarylife.consolegame.room.Direction;
import co.binarylife.consolegame.room.Room;

/**
 * Room made for demo
 * 
 * @author tbl
 *
 */
public class BedroomHallway extends Room{
	
	public BedroomHallway() {
		super(1, "BedroomHallway", "You are in a hallway filled with doors, the west and east lead down and upstairs respectivly, while the north and south lead to bedrooms.", null);
	}
	
	@Override
	public void connectRooms() {
		//addConnectingRoom(Direction.NORTH, Game.getRoomManager().getRoom(3), new Door(1, "Master Bedroom Door", null), false);
//		addConnectingRoom(Direction.SOUTH, Game.getRoomManager().getRoom(0), new Door(0, "Guest Bedroom Door", null), false);
	}
	
	@Override
	protected void loadItems() {	}

}
