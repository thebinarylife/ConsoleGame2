package co.binarylife.consolegame.item.items;

public enum CandleColor {
	BLACK("black"),
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
