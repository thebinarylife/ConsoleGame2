package co.binarylife.consolegame.item;

import co.binarylife.consolegame.player.Player;

public class DemoItem extends Item{
	
	public DemoItem() {
		super(0, "DEMO_ITEM");
	}
	
	public void use(Player player) {
		player.sendMessage(getName() + " has been used!");
	}

}