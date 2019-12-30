package me.santipingui58.com;

public class Player extends Playable {

	private int wins;
	private int kills;
	private PImage skin;
	
	public Player(String name) {
		super(name);
		this.skin = loadImage("/data/skins/"+getName()+".png");
	}
	
	
	public int getWins() {
		return this.wins;
	}
	
	public void addWin() {
		this.wins = this.wins+1;
	}
	
	public int getKills() {
		return this.kills;
	}
	
	public void addKill() {
		this.kills = this.kills + 1;
	}
	
}
