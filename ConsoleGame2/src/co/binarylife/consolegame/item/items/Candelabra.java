package co.binarylife.consolegame.item.items;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import co.binarylife.consolegame.Game;
import co.binarylife.consolegame.item.HolderItem;
import co.binarylife.consolegame.item.Item;
import co.binarylife.consolegame.item.LightableItem;
import co.binarylife.consolegame.item.UnmovableItem;
import co.binarylife.consolegame.player.Player;

public class Candelabra extends Item implements UnmovableItem, HolderItem, LightableItem {
	private Candle[] candles;
	private CandleColor[] solutionSet;
	private Painting painting;

	public Candelabra(int id, String name, String description, Painting painting) {
		super(id, name, description);
		candles = new Candle[4];
		this.painting = painting;
		setupCandles();
		rearrangeSet();
	}
	
	public Painting getLinkedPainting() {
		return painting;
	}
	
	public boolean lightCandles() {
		for(int i = 0; i < 4; i++) 
			if(solutionSet[i] != candles[i].getColor())
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
	
	public void setCandleOrder(CandleColor[] order) {
		for(int i = 0; i < 4; i++) 
			this.candles[i].setColor(order[i]);
	}
	
	public void setSolutionSet(CandleColor[] set) {
		this.solutionSet = set;
	}

	@Override
	public void onItemPlace(Item item) {
		Game.getPlayer().sendMessage("Hm.... Sounds like I heard something click...\nMaybe I could should shed some light on the subject...");
	}

	@Override
	public void onLight(Player player) {
		if(!lightCandles()) {
			player.sendMessage("\"Tsssssss...\" The candles went out... That didn't seem to work.");
			rearrangeSet();
			return;
		}
		
		player.sendMessage("You have solved the puzzle!"); // TODO whats next!
	}
	

}
