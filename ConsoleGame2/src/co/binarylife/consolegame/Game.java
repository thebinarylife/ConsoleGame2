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
	
	public boolean won;
	
	/**
	 * Game object
	 * TODO Figure out game running system
	 */
	public Game() {
		// Init Managers
		rm = new RoomManager();
		im = new ItemManager();
		rm.initRooms();
		won = false;
		
		System.out.print("What's your name?: ");
		String name = ConsoleGame.getScanner().nextLine();
		
		player = new Player(name);
		player.setRoom(0);
		// when they start send welcome message
		
//		// after, ask for a them to run the demo command
//		
//		Command command;
//		do {
//			player.sendMessage("Type demo command! (demo <item> [type \"list\" to see all items in the room])");
//			 command = cc.runCommand();
//		} while(command == null || !command.getName().equalsIgnoreCase("demo"));
//		
//		// pickup the item from the starting room
//		// Make a move command
//		command = null;
//		do {
//			player.sendMessage("Type \"move WEST\"  to move to the next room!");
//			command = cc.runCommand();
//		} while(command == null || !command.getName().equalsIgnoreCase("move"));
//		// move to Demo Room
//		// drop the item
//		
//		do {
//			player.sendMessage("Drop the item (Type \"drop <slot>\")");
//			command = cc.runCommand();
//		} while(command == null || !command.getName().equalsIgnoreCase("drop"));
//		
//		player.sendMessage("\nThank you for playing the demo!"
//				+ "\n - The Russians");
//		ConsoleGame.scanner.nextLine();
//		
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
	
	public void run() {
		ConsoleGame.setChannel(new ChatChannel(player));
		ChatChannel cc = ConsoleGame.getChannel();
		sendWelcomeMessage();
		do {
			System.out.println("What would you like to do?");
			cc.runCommand();
		} while(!won);
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
	
	public boolean isWon() {
		return won;
	}
	
	public boolean setWon(boolean won) {
		won = this.won;
		return won;
	}
}
