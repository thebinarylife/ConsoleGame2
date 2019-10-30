package co.binarylife.consolegame.command.commands;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

import co.binarylife.consolegame.command.Command;
import co.binarylife.consolegame.item.items.Door;
import co.binarylife.consolegame.player.Player;
import co.binarylife.consolegame.room.Direction;

public class MapCommand extends Command {
	
	public MapCommand() {
		super("map", 0, "map", "Lists connected doors");
	}
	
	@Override
	public boolean execute(String[] args, Player player) {
		HashMap<Direction, Door> doors = player.getRoom().getDoors();
		Collection<Direction> directions = doors.keySet();
		
		player.sendMessage("Doors:");
		for(Direction d : directions) {
			if(doors.get(d) != null)
				player.sendMessage(d.getReadable() + " " + doors.get(d).getDescription());
			else
				player.sendMessage(d.getReadable() + "No door...");
		}
		
		return true;
	}

}
