package co.binarylife.consolegame.room.rooms;

import co.binarylife.consolegame.Game;
import co.binarylife.consolegame.item.items.Door;
import co.binarylife.consolegame.room.Direction;
import co.binarylife.consolegame.room.Room;

public class MainHall extends Room{
	
	public MainHall() {
		super(8, "Main Hall", "");
	}
	
	@Override
	public void connectRooms() {
		addConnectingRoom(Direction.WEST, Game.getRoomManager().getRoom(9), new Door("Library Door", null), false);
		
	}
	
	@Override
	public void loadItems() {
		// TODO Auto-generated method stub
		
	}

}

// gold red white black

