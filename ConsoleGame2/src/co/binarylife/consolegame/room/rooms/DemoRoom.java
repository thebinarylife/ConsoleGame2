package co.binarylife.consolegame.room.rooms;

import co.binarylife.consolegame.Game;
import co.binarylife.consolegame.item.items.DemoItem;
import co.binarylife.consolegame.room.Direction;
import co.binarylife.consolegame.room.Room;

/**
 * Room made for demo
 * 
 * @author tbl
 *
 */
public class DemoRoom extends Room{
	
	public DemoRoom() {
		super(1, "DemoRoom", "Demo Room", null);
	}
	
	@Override
	public void connectRooms() {
		Room room = Game.getRoomManager().getRoom(0);
		room.addConnectingRoom(Direction.WEST, this, false);
	}
	
	@Override
	protected void loadItems() {	}

}
