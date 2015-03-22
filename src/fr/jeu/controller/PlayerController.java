package fr.jeu.controller;

import java.util.Scanner;

import fr.jeu.game.Board;
import fr.jeu.game.Heap;

public class PlayerController {

	public PlayerController(){
		
	}
	
	public Heap getMatchesNumberToRemoveFromHeap(){
		enterMatchesNumberToRremove();
		heap.removeMatches(matchesNumber);
		heap.setMatchesNumber(matchesNumber);
		return heap;
	}
	
	public void enterMatchesNumberToRremove(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number to remove matches: ");
		matchesNumber = scanner.nextInt();
	}
	
	public Heap getHeap(){
		chooseHisHeap();
		board.choose(theHeap);
		return heap;
	}
	
	public void chooseHisHeap(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a heap to remove matches: ");
		theHeap = scanner.nextInt();
	}
	
	private int theHeap;
	private int matchesNumber;
	private Board board;
	private Heap heap;
}
