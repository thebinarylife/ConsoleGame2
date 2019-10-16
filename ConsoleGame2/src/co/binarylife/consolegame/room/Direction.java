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

}
