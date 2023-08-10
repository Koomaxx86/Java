package ch9;

class Card {
	String kind;
	int nuber;
	
	Card() {
		this("SPADE", 1);
	}

	public Card(String kind, int nuber) {
		this.kind = kind;
		this.nuber = nuber;
	}
}


public class CardToString {
	public static void main(String[] args) {
		
	Card c1 = new Card();
	Card c2 = new Card();
	
	System.out.println(c1.toString());
	System.out.println(c2.toString());
	}

}
