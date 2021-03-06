package me.santipingui58.com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataManager {

	private static DataManager manager;	
	 public static DataManager getManager() {
	        if (manager == null)
	        	manager = new DataManager();
	        return manager;
	    }
	 
	 
		private ArrayList<Playable> playables = new ArrayList<Playable>();
		private ArrayList<Season> seasons = new ArrayList<Season>();
		private int miliseconds;
		
		public int getMiliSeconds() {
			return this.miliseconds;
		}
		public List<Playable> getPlayableList() {
			return this.playables;
		}
		
	 public Player getPlayer(String name) {
		 for (Playable pl : playables) {
			 if (pl instanceof Player) {
				 Player p = (Player) pl;
				 if (p.getName().equalsIgnoreCase(name)) {
					 return p;
				 }
			 }
			 }
		 return null;
		 }
	 
	 
	 
	 
	 void loadData() {
		 Table t = loadTable("/data/uhcespa�a_bbdd.csv");
		 
		 for (int y = 0; y<t.getRowAmount();y++) {
			 if (t.getString(y,1).equalsIgnoreCase("T")) {
				int team_size = t.getString(y,4);
				List<Player> participants = new ArrayList<Player>();
				for (int i = 0; i<=team_size;i++) {
					Player player = getPlayer(t.getString(y,7+i));
					if (player==null) {
						  player = new Player(t.getString(y,7+i));
					}				
					participants.add(player);
				}				       
				Team team = new Team(t.getString(y,0),participants);				
			 } else {
				 Player player = new Player(t.getString(y,0));
			 }
		 }
		 
		 
		 
		 
		
		 String temporada = null;
		 for (int y = 0;y<t.getRowAmount(); y++) {
			 if (temporada==null || temporada!= t.getString(y,2)) {
				 temporada = t.getString(y,1);
				 Season season = new Season(temporada,t.getInt(y,4),t.getInt(y,3));
				 
			 }
		 }
		
		 
		 
	 
	 }
	 
	
	 
	 
	 
	 }
	 

