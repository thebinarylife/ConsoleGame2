package co.binarylife.consolegame.room;

public enum Direction {
	NORTH("north"),
	SOUTH("south"),
	EAST("east"),
	WEST("west");
	
	private String raw;
	
	Direction(String raw) {
		this.raw = raw;
	}
	
	public String getRaw() {
		return raw; 
	}
	
	public static Direction toDirection(String direction) {
		for(Direction di : Direction.values())
			if(di.getRaw().equalsIgnoreCase(direction))
				return di;
		
		return null;
	}

}
