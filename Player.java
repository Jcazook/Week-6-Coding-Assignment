package finalProject;

import java.util.ArrayList;
import java.util.List;

public class Player {

	List<Card> hand = new ArrayList<Card>();
	int score;
	Player() { 
		score = 0;
	}
	String name;
	public String playerHand;
	//Couldn't get the Method to print the cards properly
	public void describe(String name) {
		//String playerHand;
		System.out.println(name + "'s score is: " + score);
		System.out.print(name + "'s hand: ");
		for (int i = 0; i < hand.size(); i++) {
		playerHand = (hand.get(i).describe());
		}
		System.out.println(playerHand);
	}
	public int getScore() {
		return score;
	}
	public Card flip() {
		return hand.remove(0);
	}
	public void draw(Deck deck) {
		hand.add(deck.drawcard());
	}
	public int incrementScore() {
		score = score + 1;
		return score;
	}
}
