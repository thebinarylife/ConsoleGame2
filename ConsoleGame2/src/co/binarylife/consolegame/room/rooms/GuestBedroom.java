//GuestBedroom

package co.binarylife.consolegame.room.rooms;

import co.binarylife.consolegame.Game;
import co.binarylife.consolegame.item.items.Door;
import co.binarylife.consolegame.item.items.Key;
import co.binarylife.consolegame.room.Direction;
import co.binarylife.consolegame.room.Room;

/**
 * Starting room for demo
 * 
 * @author tbl
 *
 */
public class GuestBedroom extends Room {
	private Key key;
	
	public GuestBedroom(){
		super(0, "GuestBedroom",
				"You are in a bedroom which appears no one lives in due to the lack of belongings. In the room are a bed and nightstand. Upon the nightstand you see a key");
		
		key = new Key(Game.getItemManager().getNext(), "Hallway Key", "Key to Bedroom Hallway");
	}
	
	/* Need to implement key item in this room, not 100% sure how to go about doing that yet and zach said he should have it handled - Don */
	@Override
	public void connectRooms() {
		addConnectingRoom(Direction.NORTH, Game.getRoomManager().getRoom(1), new Door("Guest Bedroom Door", key), false);
		addConnectingRoom(Direction.WEST, Game.getRoomManager().getRoom(10), new Door("Bathroom Door", null), false);
		
	}
	
	@Override
	public void loadItems() {
		addItem(key);
	}

}