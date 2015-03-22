package fr.jeu.game;

import java.util.ArrayList;
import java.util.List;

public class Board {
	
	public Board(){
		
		board = new ArrayList<Heap>();
		board.add(1, new Heap(1));
		board.add(2,new Heap(3));
		board.add(3,new Heap(5));
		board.add(4,new Heap(7));
	}
	
	public List<Heap> getBoard(){
		return board;
	}
	
	public void choose(int theHeap) {
		board.get(theHeap);
	}
	
	private List<Heap> board;

}
