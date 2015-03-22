package fr.jeu.game;

public class Heap {
		
		private int matchesNumber;
		
		public Heap(int matchesNumber){
			this.matchesNumber = matchesNumber;
		}
		
		public int removeMatches(int i){
			return matchesNumber - i;
		}
		
		public int getMatchesNumber(){
			return this.matchesNumber;
		}
		
		public void setMatchesNumber(int matches){
			this.matchesNumber = matches;
		}
}
