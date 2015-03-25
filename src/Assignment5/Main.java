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
		int hand1Value = 0;
		for (int i = 0; i<hand1.size(); i++){
			Card currentCard = hand1.get(i);
			hand1Value += currentCard.pointValue();
		}
		//Calculate hand 1 value
		int hand2Value = 0;
		for (int i = 0; i<hand2.size(); i++){
			Card currentCard = hand2.get(i);
			hand2Value += currentCard.pointValue();
		}

		//Print Stuff
		System.out.println("Hand 1: total points: " + hand1Value);
		for (int i = 0; i<hand1.size(); i++){
			System.out.println(hand1.get(i));
		}
		System.out.println("\nHand 2: total points: " + hand2Value);
		for (int i = 0; i<hand2.size(); i++){
			System.out.println(hand2.get(i));
		}
		if(hand1Value<hand2Value){
			System.out.println("Hand 2 wins");
		}else if(hand2Value<hand1Value){
			System.out.println("Hand 1 wins");
		}else
			System.out.println("Tie");
	}

}
