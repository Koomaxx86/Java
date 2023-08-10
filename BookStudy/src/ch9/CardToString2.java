package ch9;

class Card2 {
	String kind;
	int number;

	Card2() {
		this("SPADE", 1);
	}

	public Card2(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}

	@Override
	// toString 오버라이딩
	// 호출시 kind와 number를 문자열로 반환한다.
	public String toString() {
		return "Card kind=" + kind + ", number=" + number;
	}
}

public class CardToString2 {
	public static void main(String[] args) {
		Card2 c1 = new Card2();
		Card2 c2 = new Card2("HEART", 10);

		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}
}
