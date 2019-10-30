package co.binarylife.consolegame.room.rooms;

import co.binarylife.consolegame.item.items.Key;
import co.binarylife.consolegame.room.Room;

public class MasterBedroom extends Room{
	
	public MasterBedroom(){
		super(2, "MasterBedroom", "You find your self in the master bedroom which you're able to identify by the giant mattress and wardrobe before you.\n"
				+ "To the east you find another door within the bedroom, and to the south is the door you entered through");
	}
	
	@Override
	public void connectRooms() {	}

	/*Compiler was giving an error without this here so I added it, we need to add items later anyways so I will leave it here for now until
	we begin adding keys*/
	@Override
	protected void loadItems() {
		
	}
}
