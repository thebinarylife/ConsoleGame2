package co.binarylife.consolegame.item.items;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import co.binarylife.consolegame.Game;
import co.binarylife.consolegame.item.Item;

public class Candelabra extends Item {
	private Candle[] candles;
	private CandleColor[] solutionSet;
	private Painting painting;

	public Candelabra(int id, String name, String description, Painting painting) {
		super(id, name, description);
		candles = new Candle[4];
		this.painting = painting;
		setupCandles();
	}
	
	public void placeCandle(Candle candle) {
		Game.getPlayer().sendMessage(""); //TODO Add message to be sent when player places the candle
	}
	
	public Painting getLinkedPaiting() {
		return painting;
	}
	
	public boolean lightCandles(CandleColor[] set) {
		for(int i = 0; i < 4; i++) 
			if(solutionSet[i] != set[i])
				return false;
			
		return true;
	}
	
	public void rearrangeSet() {
		Random r = new Random();
		ArrayList<CandleColor> candles = (ArrayList<CandleColor>) Arrays.asList(solutionSet);
		CandleColor[] newSet = new CandleColor[4];
		for(int i = 0; i < 4; i++) {
			int cint = r.nextInt(candles.size());
			newSet[i] = candles.get(cint);
			candles.remove(cint);
		}
		
		painting.setOrder(solutionSet);
	}
	
	private void setupCandles() {
		candles[0] = new Candle(CandleColor.BLACK);
		candles[1] = new Candle(CandleColor.GOLD);
		candles[2] = new Candle(CandleColor.RED);
	}
	
	public void setSolutionSet(CandleColor[] set) {
		this.solutionSet = set;
	}
	

}
