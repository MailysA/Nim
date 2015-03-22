package fr.jeu.test;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.jeu.game.Heap;

public class PlayerShould {

	@Test
	public void removeHeapFromHeap3(){
		Heap heap = new Heap(3);
		assertEquals(heap.removeMatches(1),2);
	}
	
	@Test
	public void removeMatchesFromAHeap(){
		Heap heap = new Heap(4);
		heap.removeMatches(2);
		heap.setMatchesNumber(2);
		assertEquals(heap.getMatchesNumber(),2);
	}
}