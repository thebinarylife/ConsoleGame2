package co.binarylife.consolegame.util;

import java.util.Scanner;

import co.binarylife.consolegame.ConsoleGame;
import co.binarylife.consolegame.command.Command;
import co.binarylife.consolegame.command.CommandManager;
import co.binarylife.consolegame.player.Player;

// TODO Determine whether this class is worth it
public class ChatChannel {
	private Player player;
	
	private static CommandManager cm;
	
	public static CommandManager getCommandManager() {
		return cm;
	}
	
	public ChatChannel(Player player) {
		this.player = player;
		cm = new CommandManager();
	}
	
	public Player getPlayer() {
		return player;
	}
	
	public void sendMessage(String msg) {
		Message playerMessage = new Message(msg);
		System.out.println(playerMessage.toString() + "\n");;
	}
	
	public String getInput() {
		Scanner scanner = ConsoleGame.getScanner();
		String line = scanner.nextLine();
		return line;
	}
	
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
		
		if(!(cmdTemplate.length - 1 >= cmd.getArgsLength())) {
			player.sendMessage(cmd.getSyntax());
			return null;
		}
			
		
		// if the length of the template is 1, there are no arguments... so just pass null to execute command
		if(cmdTemplate.length < 1) {
			System.out.println(cmd);
			return cmd.execute(null, player) ? cmd : null;
			
		}
		
		String[] temp = new String[cmdTemplate.length - 1];
		for(int i = 1; i < cmdTemplate.length; i++)
			temp[i-1] = cmdTemplate[i];
		return cmd.execute(temp, player) ? cmd : null;
	}
	
	// Returns false if command was invalid
	public String[] getCommandTemplate(String line) {
		String[] temp = line.split(" ");
		
		if(temp.length <= 1)
			return null;
		
		return temp;
	}

}
