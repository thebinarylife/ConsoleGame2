package co.binarylife.consolegame.command.commands;

import co.binarylife.consolegame.command.Command;
import co.binarylife.consolegame.item.items.Door;
import co.binarylife.consolegame.player.Player;
import co.binarylife.consolegame.room.Direction;
import co.binarylife.consolegame.room.Room;

public class UnlockCommand extends Command {
	
	public UnlockCommand() {
		super("unlock", 1, "unlock <NORTH|SOUTH|EAST|WEST>", "Unlocks door in specified direction with the corresponding key.");
	}
	
	@Override
	public boolean execute(String[] args, Player player) {
		Room room = player.getRoom();
		Direction direction = Direction.toDirection(args[0]);
		
		if(direction == null) {
			player.sendMessage(getSyntax());
			return false;
		}
		
		Door door = room.getDoor(direction);
		if(door == null) {
			player.sendMessage("There is no door there!");
			return false;
		}
		
		if(!door.isLocked()) {
			player.sendMessage("That door is already unlocked!");
			return true;
		}
		
		if(!player.getInventory().contains(door.getKey())) {
			player.sendMessage("You do not have the key to this room!");
			return false;
		}
		
		door.unlock();
		player.getInventory().removeItem(door.getKey());
		player.sendMessage("The door to the " + direction.getReadable() + " has been unlocked!");
		
		return true;
	}

}
