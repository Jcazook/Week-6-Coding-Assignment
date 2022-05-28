package finalProject;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	String[] cardName = {"Hearts", "Clubs", "Spades", "Diamonds"};
	Integer[] cardValue = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
	public ArrayList<Card> cards;
	Deck(){
	cards = new ArrayList<>();
	//For loop that runs and repeats based off cardName to make cards
	for (int i = 0; i < cardName.length; i++) {
		for (int j = 0; j < cardValue.length; j++) {
			cards.add(new Card(cardValue[j], cardName[i]));
			}
		}
	}
	public void shuffle() {
		// TODO Auto-generated method stub
		Collections.shuffle(cards);
	}
	public Card drawcard() {
		return cards.remove(0);
	}
}