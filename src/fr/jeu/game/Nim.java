package fr.jeu.game;

public class Nim {
	
	private Player[] players;
	private Heap heap1;
	private Heap heap2;
	private Heap heap3;
	private Heap heap4;
	
	public Nim(String name0, String name1){
		players[0] = new Player(name0);
		players[1] = new Player(name1);
		heap1 = new Heap(1);
		heap2 = new Heap(3);
		heap3 = new Heap(5);
		heap4 = new Heap(7);
		
		launchGame(players[0],players[1]);
	}

	private void launchGame(Player perfectPlayer, Player player2) {
		playsEachTurn(perfectPlayer,player2);
	}

	private void playsEachTurn(Player perfectPlayer, Player player2) {
		int counter = 1;
		if(counter % 2 == 0)
			perfectPlayer.perfectPlay();
		else
			player2.play();
	}
}
