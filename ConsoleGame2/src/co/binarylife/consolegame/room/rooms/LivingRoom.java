package co.binarylife.consolegame.room.rooms;

import co.binarylife.consolegame.Game;
import co.binarylife.consolegame.item.items.Door;
import co.binarylife.consolegame.room.Direction;
import co.binarylife.consolegame.room.Room;

public class LivingRoom extends Room {
	
	public LivingRoom() {
		super(5, "Living Room", "");
	}

	@Override
	public void connectRooms() {
		addConnectingRoom(Direction.NORTH, Game.getRoomManager().getRoom(6), new Door("Dining Room Door", null), false);
		addConnectingRoom(Direction.EAST, Game.getRoomManager().getRoom(8), new Door("Main Hall Door", null), false);
	}

	@Override
	public void loadItems() {
		

	}

}
