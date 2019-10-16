package co.binarylife.consolegame;

import co.binarylife.consolegame.command.Command;
import co.binarylife.consolegame.item.ItemManager;
import co.binarylife.consolegame.player.Player;
import co.binarylife.consolegame.room.RoomManager;
import co.binarylife.consolegame.util.ChatChannel;

public class Game {
	private static RoomManager rm;
	private static ItemManager im;
	private static Player player;
	
	public Game() {
		// Init Managers
		rm = new RoomManager();
		im = new ItemManager();
		player = new Player("DEMO_PLAYER");
		player.setRoom(0);
		
		// when they start send welcome message
		sendWelcomeMessage();
		// after, ask for a them to run the demo command
		ChatChannel cc = ConsoleGame.getChannel();
		
		Command command;
		do {
			player.sendMessage("Type demo command! (demo <item> [type \"list\" to see all items in the room])");
			 command = cc.runCommand();
		} while(command != null && command.getName().equalsIgnoreCase("demo"));
		
		// pickup the item from the starting room
		// Make a move command
		
		// move to Demo Room
		// drop the item
		
	}
	
	public static RoomManager getRoomManager() {
		return rm;
	}
	
	public static ItemManager getItemManager() {
		return im;
	}
	
	public static Player getPlayer()
	{
		return player;
	}
	
	public void sendWelcomeMessage()
	{
		player.sendMessage("Welcome to our Adventure Game Demo!"/* message */);
		player.sendMessage("In this game you will use commands such as:\r\n" + 
				"use, get, open, and the four cardinal directions."/* ask for command demo */);
		player.getRoom().sendRoomMessage(player);
	}
	public void sendInstructions()
	{
		player.sendMessage("");
	}
}
