package com.techelevator;

public class Card {

	public static final String CLUBS = "Clubs";
	public static final String SPADES = "Spades";
	public static final String HEARTS = "Hearts";
	public static final String DIAMONDS = "Diamonds";
	
	public static final String RED = "Red";
	public static final String BLACK = "Black";
	
	private String suit;
	private int value;
	
	public Card(String suit, int value) {
		this.suit = suit;
		this.value = value;
	}
	
	public String getSuit() {
		return suit;
	}
	
	public int getValue() {
		return value;
	}
	
	public String getColor() {
		if(suit.equals(CLUBS) || suit.equals(SPADES)) {
			return BLACK;
		} else {
			return RED;
		}
	}
}
