package me.santipingui58.com;

import java.util.List;

public class Team extends Playable {

	private List<Player> players;
	public Team(String name,List<Player> players) {
		super(name);
		this.players = players;
	}
	
	public List<Player> getPlayers() {
		return this.players;
	}
	
	
}
