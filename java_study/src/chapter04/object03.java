package chapter04;

//클래스의 구조: 필드, 메서드 , 생성자
class Car { 
	// 클래스의 속성(필드)
	String model; // 모델
	int year; // 제조 연도
	
	// 클래스의 행동(메서드)
	// : 클래스 내부에서 정의된 함수, 객체의 행동을 표현
	
	// void: 해당 메서드의 반환하는 결과가 X
	// >> 반환(return)이 존재하지 않을 경우 메서드명 앞에 반드시 작성
	void display(){
		System.out.println("Model: " + model + ", year" + year);
	}
	
	// 클래스의 생성자
	// : 클래스의 이름과 동일한 메서드
	// >> 객체가 생성될 때 자동으로 호출
	// >> 클래스 내부의 필드를 초기화 할때 주로 사용
	Car(String model, int year) {
		
		model = model;
		year = year;
	}

	public void displayInfo() {
		// TODO Auto-generated method stub
		
	}
}

public class object03 {
	public static void main(String[] args) {
		// 객체 생성 (객체 인스턴스화)
		// : new 연산자를 사용
		// : 클래스의 생성자를 호출 - 객체의 초기 상태를 설정
		
		// 클래스명의 클래스의 새로운 객체를 생성
		// >> 해당 객체에 대한 참조(주소)를 클래스 타입의 변수에 저장
		Car myCar = new Car ("Urus", 2024);
		
		// 객체 사용
		// 1. 필드 접근(.연산자 사용)
		System.out.println(myCar.model);
		System.out.println(myCar.year);
		
		myCar.displayInfo();
		
		// 객체 생성 구문
		// 클래스명 객체명 = new 클래스명(생성자 매개변수);
		
		// cf) 클래스 타입
		// 지정된 클래스를 기반으로 생성된 객체임으로 클래스 자체의 타입을 지님
	}

}
