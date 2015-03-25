package Assignment5;

import java.util.ArrayList;

public class Main {
	private static ArrayList<Card> hand1 = new ArrayList<Card>();
	private static ArrayList<Card> hand2 = new ArrayList<Card>();
	private static Deck deck = new Deck();
	public static void main(String[] args){
		for (int i = 0; i<5; i++){
			hand1.add(deck.getTopCard());
			hand2.add(deck.getTopCard());
		}
		//Calculate hand 1 value
		for (int i = 0; i<hand1.size(); i++){

		}
	}

}
