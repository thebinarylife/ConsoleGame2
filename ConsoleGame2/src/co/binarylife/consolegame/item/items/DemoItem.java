package co.binarylife.consolegame.item.items;

import co.binarylife.consolegame.item.Item;
import co.binarylife.consolegame.player.Player;

public class DemoItem extends Item{
	
	public DemoItem() {
		super(0, "DEMO_ITEM");
	}
	
	public void use(Player player) {
		player.sendMessage(getName() + " has been used!");
	}

}