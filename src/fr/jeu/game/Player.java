package fr.jeu.game;

import fr.jeu.controller.PlayerController;

public class Player {
	
	public Player(String player){
		this.player = player;	
		play = new PlayerController();
		}

		public void perfectPlay() {
			play.chooseHisHeap();
		}

		public void play() {
			play.getMatchesNumberToRemoveFromHeap();
		}
		
		public String getPlayer(){
			return this.player;
		}
		
		private String player;
		private PlayerController play;
}
