package co.binarylife.consolegame;

import co.binarylife.consolegame.player.Inventory;
import co.binarylife.consolegame.player.Player;
import co.binarylife.consolegame.room.RoomManager;

public class Game {
	private static RoomManager rm;
	private static Player player;
	
	public Game() {
		// Init Managers
		rm = new RoomManager();
		player = new Player("DEMO_PLAYER");
		
	}
	
	public static RoomManager getRoomManager() {
		return rm;
	}
	
	public static Player getPlayer()
	{
		return player;
	}
	
	public void sendWelcomeMessage()
	{
		player.sendMessage(/* message */);
		player.sendMessage(/* ask for command demo */);
	}

}
