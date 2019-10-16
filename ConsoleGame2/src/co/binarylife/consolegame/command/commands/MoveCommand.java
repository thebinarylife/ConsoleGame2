package co.binarylife.consolegame.command.commands;

import co.binarylife.consolegame.command.Command;
import co.binarylife.consolegame.player.Player;
import co.binarylife.consolegame.room.Direction;
import co.binarylife.consolegame.room.Room;

public class MoveCommand extends Command {
	
	public MoveCommand() {
		super("move", 1, "move <North, South, East, West>", "Move to desired room");
	}
	
	@Override
	public boolean execute(String[] args, Player player) {
		if(!(args[0].equalsIgnoreCase("North") || args[0].equalsIgnoreCase("south")
				|| args[0].equalsIgnoreCase("West") || args[0].equalsIgnoreCase("East"))) {
			player.sendMessage(getSyntax());
			return false;
		}
		
		Room newRoom = player.move(Direction.toDirection(args[0]));
		player.sendMessage(newRoom.getName() + ": " + newRoom.getDescription());
		return true;
	}

}
