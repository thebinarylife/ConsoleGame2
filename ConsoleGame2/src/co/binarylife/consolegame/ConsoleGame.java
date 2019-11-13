package co.binarylife.consolegame;

import java.util.Scanner;

import org.gamejolt.GameJoltAPI;

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
	
	public static void initializeGameJolt()
	{
		final int GAME_ID = 448618;
		final String GAME_PRIVATE_KEY = "c486abe338b3c665df7c29ee8818731e";
		String username;
		String usertoken;
		GameJoltAPI api = new GameJoltAPI(GAME_ID, GAME_PRIVATE_KEY);
		boolean first = true;
		
		do {
			if(!first)
				System.out.println("Error: Login failed!\n");
			
			System.out.println("Please login to game jolt!");
			System.out.print("Username: ");
			username = scanner.nextLine();
			System.out.print("User Token: ");
			usertoken = scanner.nextLine();
			
			first = false;
		} while(!api.verifyUser(username, usertoken));
		
		System.out.print("Login Successful!\n");
	}
	
	public static void displayMainPage() {
		System.out.println("Welcome Message\n");
		System.out.println("Type start to start");
		
		String input;
		do {
			input = scanner.nextLine();
		} while(!input.equalsIgnoreCase("start"));
	}

}