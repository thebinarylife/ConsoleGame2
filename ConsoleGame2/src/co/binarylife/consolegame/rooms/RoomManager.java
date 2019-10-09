package co.binarylife.consolegame.rooms;

import java.util.ArrayList;

public class RoomManager {
	private ArrayList<Room> rooms;
	private int currentPosition;
	
	public RoomManager(int currentPosition)
	{
		this.rooms = new ArrayList<>();
		this.currentPosition = currentPosition;
	}
	
	public ArrayList<Room> getRooms()
	{
		return rooms;
	}
	
	public int getCurrentPosition()
	{
		return currentPosition;
	}

}
