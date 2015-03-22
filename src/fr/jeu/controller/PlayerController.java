package fr.jeu.controller;

import java.util.Scanner;

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
		System.out.println("enter a number to remove matches: ");
		matchesNumber = scanner.nextInt();
	}
	
	private int matchesNumber;
	private Heap heap;
}
