package co.binarylife.consolegame.item.items;

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

}
