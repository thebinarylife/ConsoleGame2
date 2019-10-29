package co.binarylife.consolegame.room.rooms;

import java.util.ArrayList;

import co.binarylife.consolegame.Game;
import co.binarylife.consolegame.item.items.DemoItem;
import co.binarylife.consolegame.item.items.Door;
import co.binarylife.consolegame.room.Direction;
import co.binarylife.consolegame.room.Room;

public class MasterBedroom extends Room{
	public MasterBedroom(){
		super(2, "MasterBedroom", "You find your self in the master bedroom which you're able to identify by the giant mattress and wardrobe before you. "
				+ "To the east you find another door within the bedroom, and to the south is the door you entered through", null);
	}
	
	@Override
	public void connectRooms() {
		//addConnectingRoom(Direction.SOUTH, Game.getRoomManager().getRoom(1), new Door(0, "Guest Bedroom Door", null), false);
		
		
	}

	/*Compiler was giving an error without this here so I added it, we need to add items later anyways so I will leave it here for now until
	we begin adding keys*/
	@Override
	protected void loadItems() {
		// TODO Auto-generated method stub
		
	}
}
