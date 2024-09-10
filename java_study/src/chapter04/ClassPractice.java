package chapter04;

class Card{
	int number;
	String kind;
	
	// 클래스 변수: 모든 카드가 공유할 데이터
	static int width = 100;
	static int height = 250;
	
}

public class ClassPractice {
	public static void main(String[] args) {
		
		
		System.out.println(Card.width);
		System.out.println(Card.height);
		
		Card c1 = new Card();
		c1.kind = "Spade";
		c1.number = 7;
		
		System.out.println(c1.kind + c1.number); // spade7
	}
}
