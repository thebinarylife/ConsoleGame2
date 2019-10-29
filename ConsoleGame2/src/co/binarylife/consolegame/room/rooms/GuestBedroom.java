//GuestBedroom

package co.binarylife.consolegame.room.rooms;

import java.util.ArrayList;

import co.binarylife.consolegame.Game;
import co.binarylife.consolegame.item.items.DemoItem;
import co.binarylife.consolegame.item.items.Door;
import co.binarylife.consolegame.room.Direction;
import co.binarylife.consolegame.room.Room;

/**
 * Starting room for demo
 * 
 * @author tbl
 *
 */
public class GuestBedroom extends Room {
	
	public GuestBedroom(){
		super(0, "GuestBedroom", "You are in a bedroom which appears no one lives in due to the lack of belongings. In the room are a bed and nightstand. Upon the nightstand you see a key", 
				new ArrayList<>());
	}
	
	/* Need to implement key item in this room, not 100% sure how to go about doing that yet and zach said he should have it handled - Don */
	@Override
	public void connectRooms() {
		addConnectingRoom(Direction.NORTH, Game.getRoomManager().getRoom(1), new Door(0, "Guest Bedroom Door", null), false);
		
		
	}
	
	@Override
	protected void loadItems() {
		addItem(new DemoItem());
	}

}