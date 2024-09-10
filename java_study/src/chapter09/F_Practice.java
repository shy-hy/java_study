package chapter09;

// 인터페이스
// Fruit 인터페이스 정의
// - color 라는 추상 메서드
// - describe 라는 디폴트 메서드
// - printType 라는 정적 메서드

interface Fruit {
	String color();

default void describe() {
	System.out.println("과일의 색상은" + color() + "입니다.");
}


static void printType() {
	System.out.println("과일(Fruit)의 타입입니다.");
}
}

class Apple implements Fruit{

	@Override
	public String color() {
		// TODO Auto-generated method stub
		return "red";
		
	}
	
	// 디폴트 메서드를 재정의 X
	// >> Fruit에 있는 디폴트 메서드가 생략된 형태
	
}

class Orange implements Fruit {

	@Override
	public String color() {
		// TODO Auto-generated method stub
		return "orange";
	}
	
}

public class F_Practice {
	public static void main(String[] args) {
		
		Fruit apple = new Apple();
		Fruit orange = new Orange();
		
		apple.describe();
		orange.describe();
		
		//정적 메서드 활용 - 인터페이스 자체로 호출
		Fruit.printType();
		
	}
}
