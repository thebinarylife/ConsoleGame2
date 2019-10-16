package co.binarylife.consolegame.util;

import java.util.Scanner;

import co.binarylife.consolegame.ConsoleGame;
import co.binarylife.consolegame.command.Command;
import co.binarylife.consolegame.player.Player;

// TODO Determine whether this class is worth it
public class ChatChannel {
	private Player player;
	
	public ChatChannel(Player player) {
		this.player = player;
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
	
	public Command getCommand() {
		getCommandTemplate
	}
	
	// Returns false if command was invalid
	public String[] getCommandTemplate(String line) {
		String[] temp = line.split(" ");
		
		if(temp.length >= 1)
			return null;
		
		return temp;
	}

}
