package co.binarylife.consolegame.item.items;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

	public Candelabra(Painting painting) {
		super(Game.getItemManager().getNext(), "Candelabra", "Looks like a antique candelabra... With some candles.");
		candles = new Candle[4];
		this.painting = painting;
		this.solutionSet = new CandleColor[4];
		setupCandles();
		rearrangeSet();
	}
	
	public Candle[] getCandles() {
		return candles;
	}
	
	public Painting getLinkedPainting() {
		return painting;
	}
	
	@Override
	public String getDescription() {
		String desc = super.getDescription() + " ";
		for(Candle c : candles) {
			if(c == null)
				continue;
			
			desc += " " + c.getColor().toString();
	}
		
		return desc += ". Hmm...";
	}
	
	public boolean lightCandles() {
		for(int i = 0; i < 4; i++) 
			if(solutionSet[i] != candles[i].getColor())
				return false;
			
		return true;
	}
	
	public void rearrangeSet() {
		Random r = new Random();
		
		if(solutionSet == null) 
			for(int i = 0; i < 4; i++)
				solutionSet[i] = this.candles[i].getColor();
		
		ArrayList<CandleColor> candles = new ArrayList<>();
		for(Candle c : this.candles) {
			if(c == null)
				continue;
			
			candles.add(c.getColor());
		}
		
		candles.add(CandleColor.WHITE);
		
		CandleColor[] newSet = new CandleColor[4];
		for(int i = 0; i < 4; i++) {
			int cint = r.nextInt(candles.size());
			newSet[i] = candles.get(cint);
			candles.remove(cint);
		}
		
		solutionSet = newSet;
		painting.setOrder(solutionSet);
	}
	
	private void setupCandles() {
		candles[0] = new Candle(CandleColor.BLACK);
		candles[1] = new Candle(CandleColor.GOLD);
		candles[2] = new Candle(CandleColor.RED);
	}
	
	public void setCandleOrder(CandleColor[] order) {
		System.out.println(this.candles + " " + candles.length);
		for(int i = 0; i < 4; i++) {
			this.candles[i].setColor(order[i]);
		}
	}
	
	public void setSolutionSet(CandleColor[] set) {
		this.solutionSet = set;
	}

	@Override
	public void onItemPlace(Item item) {
		Candle candle = (Candle) item;
		candles[3] = candle;
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

// gold black white red
