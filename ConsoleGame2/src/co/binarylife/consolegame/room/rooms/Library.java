package co.binarylife.consolegame.room.rooms;

import co.binarylife.consolegame.item.items.Candle;
import co.binarylife.consolegame.item.items.CandleColor;
import co.binarylife.consolegame.item.items.Painting;
import co.binarylife.consolegame.room.Room;

public class Library extends Room {
	
	public Library() {
		super(9, "Library", "");
		addItem(new Painting());
	}

	@Override
	public void connectRooms() {

	}

	@Override
	public void loadItems() {
		addItem(new Candle(CandleColor.WHITE));
	}

}
