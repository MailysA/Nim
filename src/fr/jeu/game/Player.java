package fr.jeu.game;

import fr.jeu.controller.PlayerController;

public class Player {
	
	public Player(String player){
		this.player = player;	
		play = new PlayerController();
		}

		public void perfectPlay() {
			play.getMatchesNumberToRemoveFromHeap();
		}

		public void play() {
			play.getMatchesNumberToRemoveFromHeap();
		}
		
		private String player;
		private PlayerController play;
}
