package co.binarylife.consolegame.item.items;

import co.binarylife.consolegame.room.Direction;

public enum CandleColor {
	BLACK("blue"),
	WHITE("white"),
	RED("red"),
	GOLD("gold");
	
	private String raw;
	
	CandleColor(String raw) {
		this.raw = raw;
	}
	
	public String toString() {
		return raw;
	}
	
	public static CandleColor toColor(String color) {
		for(CandleColor c : CandleColor.values()) {
			if(c.toString().equalsIgnoreCase(color.toLowerCase()))
				return c;
		}
		return null;
	}

}
