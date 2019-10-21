package co.binarylife.consolegame.util;

import java.util.Scanner;

import co.binarylife.consolegame.ConsoleGame;
import co.binarylife.consolegame.command.Command;
import co.binarylife.consolegame.command.CommandManager;
import co.binarylife.consolegame.player.Player;

/**
 * Handles all ingoing and outgoing communication between player and game
 * 
 * @author tbl
 *
 */
public class ChatChannel {
	private Player player;
	
	private static CommandManager cm;
	
	/**
	 * Gets CommandManager that handles all commands
	 * 
	 * @return CommandManager instance
	 */
	public static CommandManager getCommandManager() {
		return cm;
	}
	
	/**
	 * Create ChatChannel object and initialize CommandManager
	 * @param player player for channel
	 */
	public ChatChannel(Player player) {
		this.player = player;
		cm = new CommandManager();
	}
	
	/**
	 * Get Player channel was created with
	 * 
	 * @return player
	 */
	public Player getPlayer() {
		return player;
	}
	
	/**
	 * Send message to player
	 * 
	 * @param msg raw string of message
	 */
	public void sendMessage(String msg) {
		Message playerMessage = new Message(msg);
		System.out.println(playerMessage.toString() + "\n");;
	}
	
	/**
	 * Get next line from player
	 * 
	 * @return input from player
	 */
	public String getInput() {
		Scanner scanner = ConsoleGame.getScanner();
		String line = scanner.nextLine();
		return line;
	}
	
	/**
	 * Run a command from player
	 * TODO CLEANUP
	 * 
	 * @return Command object with instance of the command the player has run... If the player has put in a command that does not exists, it returns null
	 */
	public Command runCommand() {
		// player input: get item
		// getCommandTemplate returns { "get", "item" }
		String[] cmdTemplate = getCommandTemplate(getInput());
		if(cmdTemplate == null) {
			player.sendMessage("Syntax: <cmd> [args]");
			return null;
		}
		
		// First element is command
		Command cmd = cm.getCommand(cmdTemplate[0]);
		if(cmd == null) {
			player.sendMessage("This command does not exist!");
			return null;
		}
		
		// IF the length of the arguments given by the player is less than the least amount of args needed...
		// return null bc it didnt work correctly
		if(!(cmdTemplate.length - 1 >= cmd.getArgsLength())) {
			player.sendMessage(cmd.getSyntax());
			return null;
		}
			
		
		// if the length of the template is 1, there are no arguments... so just pass null to execute command
		if(cmdTemplate.length < 1) {
			return cmd.execute(null, player) ? cmd : null;
		}
		
		String[] temp = new String[cmdTemplate.length - 1];
		for(int i = 1; i < cmdTemplate.length; i++)
			temp[i-1] = cmdTemplate[i];
		
		return cmd.execute(temp, player) ? cmd : null;
	}
	
	/**
	 * Get template to be used for commands. [0] = command, [1+] are arguments
	 * 
	 * @param line line to be split into a command template
	 * @return returns array of each individual word from players input line
	 */
	public String[] getCommandTemplate(String line) {
		String[] temp = line.split(" ");
		
		if(temp.length < 1)
			return null;
		
		return temp;
	}

}
