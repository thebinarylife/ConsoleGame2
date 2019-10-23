package co.binarylife.consolegame;

import java.util.Scanner;

import co.binarylife.consolegame.util.ChatChannel;

public class ConsoleGame {
	private static ChatChannel channel;
	public static Scanner scanner;
	
	public static void main(String[] args) {
		
		initScanner();
		displayMainPage();
		// TODO initialize in correct place
		Game game = new Game();
		game.run();
	}
	
	public static void initScanner() {
		try {
			scanner = new Scanner(System.in);
		} catch (Exception e){
			System.out.println("Scanner init problem");
			e.printStackTrace();
			return;
		}
	}
	
	public static ChatChannel getChannel() {
		return channel;
	}
	public static void setChannel(ChatChannel chnl) {
		channel = chnl;
	}
	
	public static Scanner getScanner() {
		return scanner;
	}
	
	public static void displayMainPage() {
		System.out.println("Welcome Message");
		System.out.println("Type start to start");
		
		String input;
		do {
			input = scanner.nextLine();
		} while(!input.equalsIgnoreCase("start"));
	}

}