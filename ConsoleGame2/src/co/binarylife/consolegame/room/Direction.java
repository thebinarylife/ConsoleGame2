package co.binarylife.consolegame.room;

/**
 * Enum of cardinal directions to be used for migrating and connecting rooms
 * 
 * @author tbl
 *
 */
public enum Direction {
	NORTH("north"),
	SOUTH("south"),
	EAST("east"),
	WEST("west");
	
	private String raw;
	
	/**
	 * Direction constructor
	 * 
	 * @param raw raw string of direction
	 */
	Direction(String raw) {
		this.raw = raw;
	}
	
	/**
	 * Get raw string of direction
	 * 
	 * @return raw string of direction
	 */
	public String getRaw() {
		return raw; 
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
