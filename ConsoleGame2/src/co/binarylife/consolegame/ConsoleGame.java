package co.binarylife.consolegame;

import java.io.InputStream;
import java.util.Scanner;

import co.binarylife.consolegame.util.ChatChannel;

public class ConsoleGame {
	private static ChatChannel channel;
	public static Scanner scanner;
	
	public static void main(String[] args) {
		// TODO initialize in correct place
		channel = new ChatChannel(null);
		Game game = new Game();
	}
	
	public static void initScanner() {
		try {
			InputStream in = null;
			scanner = new Scanner(in);
		} catch (Exception e){
			
			System.out.println("Scanner init problem");
			return;
		}
	}
	
	public static ChatChannel getChannel() {
		return channel;
	}
	
	public static Scanner getScanner() {
		return scanner;
	}
	
	public void startGame() {
		
	}

}