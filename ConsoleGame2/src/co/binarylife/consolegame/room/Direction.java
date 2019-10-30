package co.binarylife.consolegame.room;

/**
 * Enum of cardinal directions to be used for migrating and connecting rooms
 * 
 * @author tbl
 *
 */
public enum Direction {
	NORTH("north", "North"),
	SOUTH("south", "South"),
	EAST("east", "South"),
	WEST("west", "West");
	
	private String raw;
	private String readable;
	
	/**
	 * Direction constructor
	 * 
	 * @param raw raw string of direction
	 */
	Direction(String raw, String readable) {
		this.raw = raw;
		this.readable = readable;
	}
	
	/**
	 * Get raw string of direction
	 * 
	 * @return raw string of direction
	 */
	public String getRaw() {
		return raw; 
	}
	
	public String getReadable() {
		return readable;
	}
	
	/**
	 * Converts string direction to Direction.DIRECTION
	 * 
	 * @param direction string of desired direction
	 * @return Direction of converted String, null if string cannot be converted
	 */
	public static Direction toDirection(String direction) {
		for(Direction di : Direction.values()) {
			if(di.getRaw().equalsIgnoreCase(direction.toLowerCase()))
				return di;
		}
		return null;
	}

}
