package com.techelevator;

public class CardTest {

	public static void main(String[] args) {
		Card twoOfHearts = new Card(Card.HEARTS, 2);
		System.out.println(twoOfHearts.getSuit());
		System.out.println(twoOfHearts.getValue());
		System.out.println(twoOfHearts.getColor());
		
		Card sixOfClubs = new Card(Card.CLUBS, 6);
		System.out.println(sixOfClubs.getSuit());
		System.out.println(sixOfClubs.getValue());
		System.out.println(sixOfClubs.getColor());
		
	}
}
