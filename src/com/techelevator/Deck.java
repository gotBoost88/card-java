package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class Deck {

	private boolean isShuffled;
	private List<Card> cards;
	
	public Deck() {
		cards = new ArrayList<>();
		for(int i = 1; i <= 13; i++) {
			cards.add(new Card(Card.DIAMONDS, i));
		}
		for(int i = 1; i <= 13; i++) {
			cards.add(new Card(Card.HEARTS, i));
		}
		for(int i = 1; i <= 13; i++) {
			cards.add(new Card(Card.CLUBS, i));
		}
		for(int i = 1; i <= 13; i++) {
			cards.add(new Card(Card.SPADES, i));
		}
		
		isShuffled = false;
	}
	
	public Card[] draw(int numberOfCardsToDraw) {
		Card[] cardsDrawn = new Card[numberOfCardsToDraw];
		// draw the cards
		for(int i = 0; i < numberOfCardsToDraw; i++) {
			cardsDrawn[i] = cards.get(i);
		}
		
		// remove the cards that were drawn
		for(int i = 0; i < numberOfCardsToDraw; i++) {
			cards.remove(0);
		}
		return cardsDrawn;
	}
}
