//Group Members: Ryan, Mayerly, Raymond, Hector

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//import javax.smartcardio.Card; <-- Broke the code, not sure why

public class CardGame {

	private static ArrayList<Card> deckOfCards = new ArrayList<Card>();
	private static ArrayList<Card> playerCards = new ArrayList<Card>();

    

	public static void main(String[] args) {


		Scanner input = null;
		try {
			input = new Scanner(new File("cards.txt"));
		} catch (FileNotFoundException e) {
			// error
			System.out.println("error");
			e.printStackTrace();
		}

		while(input.hasNext()) {
			ArrayList<String> fields = new ArrayList<>(Arrays.asList(input.nextLine().split(","))); //Changed to ArrayList
			Card newCard = new Card(fields.get(0), fields.get(1).trim(), //now uses .get to access ArrayList
					Integer.parseInt(fields.get(2).trim()), fields.get(3)); //now uses .get to access ArrayList
			deckOfCards.add(newCard);	
		}

		shuffle();


		//updated to deal the player 7 cards, alter to liking
		for(int i = 0; i < 7; i++) {
			playerCards.add(deckOfCards.remove(i));
		}
		
		System.out.println("Players Cards:");
		for(Card c: playerCards)
			System.out.println(c);

		System.out.println("pairs is " + checkFor2Kind()); //calls pair method to detertimne true or false

	}//end main

	public static void shuffle() {

		//shuffling the cards by deleting and reinserting
		for (int i = 0; i < deckOfCards.size(); i++) {
			int index = (int) (Math.random()*deckOfCards.size());
			Card c = deckOfCards.remove(index);
			deckOfCards.add(c);
		}
	}

	//check for 2 of a kind in the players hand
	public static boolean checkFor2Kind() {

		int count = 0;
		for(int i = 0; i < playerCards.size() - 1; i++) {
			Card current = playerCards.get(i);
			Card next = playerCards.get(i+1);
			
			for(int j = i+1; j < playerCards.size(); j++) {
				next = playerCards.get(j);
				
				if(current.equals(next))
					count++;
			}//end of inner for
			if(count == 1)
				return true;

		}//end outer for
		return false;

		
	}
	
}//end class

