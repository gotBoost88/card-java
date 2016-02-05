package com.techelevator;

public class DeckTest {

	public static void main(String[] args) {
		
		boolean allTestsPassed = true;
		
		Deck theDeck = new Deck();
		Card[] theCards = theDeck.draw(52);
		if(theCards.length != 52) {
			allTestsPassed = false;
			System.out.println("FAIL : expected 52 cards but there are "+theCards.length);
		}
		
		for(Card c : theCards) {
			System.out.println(c.getValue() + " of " + c.getSuit());
		}

		System.out.println();
		System.out.println();
		theDeck = new Deck();
		theCards = theDeck.draw(5);
		for(Card c : theCards) {
			System.out.println(c.getValue() + " of " + c.getSuit());
		}
		System.out.println();
		theCards = theDeck.draw(5);
		for(Card c : theCards) {
			System.out.println(c.getValue() + " of " + c.getSuit());
		}
		
		if(allTestsPassed) {
			System.out.println("All tests passed");
		}
	}
}
