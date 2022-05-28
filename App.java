package finalProject;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deck deck = new Deck();
		deck.shuffle();
		
		Player playerOne = new Player();
		Player playerTwo = new Player();
		
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				playerOne.draw(deck);
			} else {
				playerTwo.draw(deck);
			}
		}
		
		for (int j = 0; j < 26; j++) {
			Card player1Value = playerOne.flip();
			Card player2Value = playerTwo.flip();
			if (player1Value.getValue() > player2Value.getValue()) {
				playerOne.incrementScore(); 
			} else {
				playerTwo.incrementScore();
			}
		}
		playerOne.describe("Player One");
		playerTwo.describe("Player Two");
		System.out.println("-----------GAME-END------------");
		System.out.println("| Player One's final score: " + playerOne.getScore() + "|");
		System.out.println("| Player Two's final score: " + playerTwo.getScore() + "|");
		System.out.println("-------------------------------");
		if (playerOne.getScore() > playerTwo.getScore()) {
			System.out.println("~~~~~~~~Player One Wins~~~~~~~~");
		} else if (playerTwo.getScore() > playerOne.getScore()) {
			System.out.println("~~~~~~~~Player Two Wins~~~~~~~~");
		} else {
			System.out.println("~~~~~~Draw.... FATALITY!!~~~~~~");
		}
	}
		
}
