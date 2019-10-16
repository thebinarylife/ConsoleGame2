package co.binarylife.consolegame.room.rooms;

import java.util.ArrayList;

import co.binarylife.consolegame.room.Room;

public class StartingRoom extends Room {
	
	public StartingRoom(){
		super(0, "Starting", "Starting room", new ArrayList<>());
	}
	
	@Override
	public void connectRooms() {
		
		
	}

}
