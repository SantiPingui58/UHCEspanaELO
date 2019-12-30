package me.santipingui58.com;

public class Playable {

	private String name;
	
	private int currentELO;
	private int futureELO;
	private int currentY;
	private int futureY;
	
	
	public Playable(String name) {
		this.name = name;
		DataManager.getManager().getPlayableList().add(this);
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getCurrentELO() {
		return this.currentELO;
	}
	
	public void setCurrentELO(int i) {
		this.currentELO = i;
	}
	
	public int getFutureELO() {
		return this.futureELO;
	}
	
	public void setFutureELO(int i) {
		this.futureELO = i;
	}
	
	public int getCurrentY() {
		return this.currentY;
	}
	
	public void setCurrentY(int i) {
		this.currentY = i;
	}
	
	public int getFutureY() {
		return this.futureY;
	}
	
	public void setFutureY(int i) {
		this.futureY = i;
	}
	
	
}
