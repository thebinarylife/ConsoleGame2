package co.binarylife.consolegame.room.rooms;

import java.util.ArrayList;

import co.binarylife.consolegame.item.items.DemoItem;
import co.binarylife.consolegame.room.Room;

/**
 * Starting room for demo
 * 
 * @author tbl
 *
 */
public class StartingRoom extends Room {
	
	public StartingRoom(){
		super(0, "Starting", "Starting room", new ArrayList<>());
	}
	
	@Override
	public void connectRooms() {
		
		
	}
	
	@Override
	protected void loadItems() {
		addItem(new DemoItem());
	}

}
