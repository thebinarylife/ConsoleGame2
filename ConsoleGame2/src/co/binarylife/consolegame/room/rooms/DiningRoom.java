package co.binarylife.consolegame.room.rooms;

import co.binarylife.consolegame.Game;
import co.binarylife.consolegame.item.items.Door;
import co.binarylife.consolegame.room.Direction;
import co.binarylife.consolegame.room.Room;

public class DiningRoom extends Room {
	
	public DiningRoom() {
		super(6, "Dining Room", "");
	}

	@Override
	public void connectRooms() {
		addConnectingRoom(Direction.EAST, Game.getRoomManager().getRoom(7), new Door("Kitchen Door", null), false);
	}

	@Override
	public void loadItems() {
		
	}

}
