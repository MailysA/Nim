package fr.jeu.game;

import fr.jeu.utils.Log;

public class Nim {
	
	private Player[] players;
	
	public Nim(String name0, String name1){
		players[0] = new Player(name0);
		players[1] = new Player(name1);
		new Board();
		
		launchGame(players[0],players[1]);
	}

	private void launchGame(Player perfectPlayer, Player player2) {
		playsEachTurn(perfectPlayer,player2);
	}

	private void playsEachTurn(Player perfectPlayer, Player player2) {
		int counter = 1;
		if(counter % 2 == 0){
			Log.show(perfectPlayer.getPlayer() + "joue : ");
			perfectPlayer.perfectPlay();
		}else{
			Log.show(player2.getPlayer() + "joue : ");
			player2.play();
		}
	}
}
