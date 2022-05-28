package finalProject;
public class Card {
	
		// TODO Auto-generated constructor stub
	String name;
	int value;
	
	//Getters and setters for the name and value variable
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public int getValue() {
		return value;
	}
	//Constructor to make the plugged in variables a card for a list
	public Card(int cardValue, String cardName) {
		// TODO Auto-generated constructor stub
		this.name = cardName;
		this.value = cardValue;
	}
		public Card() {
		// TODO Auto-generated constructor stub
	}
		//Describes the card
		public String describe() {
			return (name + ". Value of " + value);
	        
		}	
}