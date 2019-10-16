package co.binarylife.consolegame.player;

public class Player {
	private String name;
	private Inventory inv;
	
	// TODO Decide whether inventory should be created outside of player class or in player class
	public Player(String name) {
		inv = new Inventory(this);
	}
	
	public String getName() {
		return name;
	}
	
	public Inventory getInventory() {
		return inv;
	}
	
	public void sendMessage(String message) {
		System.out.println(message);
	}

}
