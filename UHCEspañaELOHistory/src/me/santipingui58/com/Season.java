package me.santipingui58.com;

import java.util.List;

public class Season {

	
	private String name;
	private int teams_amount;
	private Playable winner;
	private List<Playable> participants;
	
	public Season(String name,int size, int amount, Playable winner,List<Playable> playable) {
		this.name = name;
		this.teams_amount = amount;
		this.winner = winner;
		this.participants = playable;
	}
	
	
	public List<Playable> getParticipants() {
		return this.participants;
	}
	
	
	public String getName() {
		return this.name;
	}
	
	public int getTeamsAmount() {
		return this.teams_amount;
	}
	
	public Playable getWinner() {
		return this.winner;
	}
	
}
