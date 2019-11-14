package co.binarylife.consolegame.room.rooms;
import co.binarylife.consolegame.Game;
import co.binarylife.consolegame.item.items.Door;
import co.binarylife.consolegame.item.items.Key;
import co.binarylife.consolegame.room.Direction;
import co.binarylife.consolegame.room.Room;

/**
 * Room made for demo
 * 
 * @author tbl
 *
 */
public class BedroomHallway extends Room{
	private Key key;
	
	public BedroomHallway() {
		super(2, "Bedroom Hallway", "You are in the center of a strange hallway that only contains two doors, to the north and south, and a stairway to the west leading downstairs, and one to the east leading to the attic.");
		
		key = new Key(Game.getItemManager().getNext(), "Bedroom Key", "Key to Master Bedroom");
	}
	
	@Override
	public void connectRooms() {
		addConnectingRoom(Direction.NORTH, Game.getRoomManager().getRoom(3), new Door("Master Bedroom Door", key), false);
		addConnectingRoom(Direction.WEST, Game.getRoomManager().getRoom(5), new Door("Door Downstairs", null), false);
		//Don wants to know how to add the door argument without instantiating a new door, unless doors are unidirectional
		
		//addConnectingRoom(Direction.SOUTH, Game.getRoomManager().getRoom(0), new Door(0, "Guest Bedroom Door", null) , false);
	}
	
	@Override
	public void loadItems() {
		addItem(key);
	}

}
